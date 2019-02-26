package com.tourism.fore.mapper;

import com.tourism.fore.pojo.Park;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomePageMapper {

    //首页团日游乐推荐
    List<Park> showLocalList(Park park);

    //周边推荐列表
    List<Park> showLocalParkList(String parkProvince);

}