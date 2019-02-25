package com.tourism.fore.controller;

import com.tourism.fore.pojo.Park;
import com.tourism.fore.service.HomePageService;
import com.tourism.fore.util.GeohashUtil;
import com.tourism.fore.util.SphericalDistanceUtil;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

//@CrossOrigin解决跨域问题
@RestController
@CrossOrigin
@RequestMapping("/tourism/user")
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

    //首页周边推荐
    @RequestMapping(method = RequestMethod.GET)
    public Result getPerimeter(){

        double lng = Double.parseDouble("113.287879");// 经度坐标
        double lat = Double.parseDouble("23.112686");// 纬度坐标

        double lngSql; //从数据库查询的经度
        double latSql; //从数据库查询的纬度
        int dist;   //距离

        //将获取的经纬度，转换成 Base32编码
        GeohashUtil geohashUtil = new GeohashUtil();
        SphericalDistanceUtil sphericalDistanceUtil = new SphericalDistanceUtil();
        String s = geohashUtil.encode(lat, lng);

        //从数据库中查询周边景区集合
        Park park = new Park();
        park.setParkEncode(s.substring(0,4).concat("%"));

        //将list集合的数据，向上强转，为数组集合
        ArrayList<Park> arrList = (ArrayList<Park>)homePageService.showLocalList(park);
        //遍历所有的arrList集合
        Iterator it = arrList.iterator();
        while(it.hasNext()){
            park = (Park)it.next();

            //判断当前位置和周边景区的距离，然后赋值给Park实体
            lngSql = Double.parseDouble(park.getParkLng());
            latSql = Double.parseDouble(park.getParkLat());
            dist = (int)sphericalDistanceUtil.getDistance(lng, lat, lngSql, latSql);
            park.setDist(dist);
        }
        //用于比较排序，实现Comparator的方法，根据距离大小
        Comparator<Park> comparator = new Comparator<Park>() {
            public int compare(Park park1, Park park2) {
                if(park1.getDist() != park2.getDist()){
                    //距离判断排序
                    return park1.getDist() - park2.getDist();
                }else {
                    //人气值判断排序
                    return park1.getParkPopularity().compareTo(park2.getParkPopularity());
                }
            }
        };
        //用于比较排序，对arrList集合进行按照从进到远排序
        Collections.sort(arrList, comparator);
        //获取arrList集合中的前5个数据，以JSON格式传递
        return new Result(
                true,
                StatusCode.OK,
                "查询成功",
                arrList.subList(0,3));
    }

}
