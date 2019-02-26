package com.tourism.fore.service;

import com.tourism.fore.mapper.HomePageMapper;
import com.tourism.fore.pojo.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomePageService {

    @Autowired
    private HomePageMapper homePageMapper;

    //首页团日游乐推荐列表
    public List<Park> showLocalList(Park park){
        return homePageMapper.showLocalList(park);
    }

    //首页周边推荐列表
    public List<Park> showLocalParkList(String parkProvince) {
        return homePageMapper.showLocalParkList(parkProvince);
    }

}