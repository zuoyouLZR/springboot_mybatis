package com.zuoyou.mybatis.controller;

import com.zuoyou.mybatis.entity.User;
import com.zuoyou.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/userList")
    public List<User>queryUserList(){
        int a = 1;
        List<User>userList=userMapper.queryUserList();
        return userList;
    }

}
