package com.tourism.fore.mapper;

import com.tourism.fore.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //普通用户登录
    void findUserByNameAndPwd(UserLogin userLogin);
}
