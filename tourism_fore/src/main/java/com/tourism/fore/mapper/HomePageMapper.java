package com.tourism.fore.mapper;

import com.tourism.fore.pojo.Park;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomePageMapper {

    //首页的周边推荐
    List<Park> showLocalList(Park park);

}