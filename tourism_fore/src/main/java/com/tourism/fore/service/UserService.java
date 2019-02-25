package com.tourism.fore.service;

import com.tourism.fore.mapper.UserMapper;
import com.tourism.fore.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional    //注入事务
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //普通用户登录
    public void findUserByNameAndPwd(UserLogin userLogin){
        System.out.println("service层1");
        userMapper.findUserByNameAndPwd(userLogin);
        System.out.println("service层2");
    }
}
