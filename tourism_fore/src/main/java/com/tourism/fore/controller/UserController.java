package com.tourism.fore.controller;

import com.tourism.fore.pojo.UserLogin;
import com.tourism.fore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin解决跨域问题
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private UserLogin userLogin = new UserLogin();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void userLogin(@RequestBody UserLogin userLogin) {
        System.out.println("111" + userLogin.getLoginPhone());
        System.out.println("111" + userLogin.getLoginPassword());
    }
}
