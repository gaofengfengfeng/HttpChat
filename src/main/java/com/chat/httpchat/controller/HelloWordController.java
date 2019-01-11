package com.chat.httpchat.controller;

import com.chat.httpchat.mapper.User;
import com.chat.httpchat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaofeng
 * @Date: 2019-01-07
 * @Description: 一个api入口类
 */
@RestController
@RequestMapping(value = "/helloworld")
public class HelloWordController {

    private UserMapper userMapper;

    @Autowired
    public HelloWordController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping(value = "/hello")
    public String hello() {

        User user = new User();
        user.setUsername("zhangsan");
        user.setPhone("17801020000");
        user.setPassword("123456");

        userMapper.saveUser(user);
        return "hello";
    }
}
