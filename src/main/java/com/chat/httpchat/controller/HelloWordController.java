package com.chat.httpchat.controller;

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

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
