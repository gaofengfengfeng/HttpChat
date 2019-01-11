package com.chat.httpchat.mapper;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: gaofeng
 * @Date: 2019-01-11
 * @Description:
 */
@Data
public class User implements Serializable {
    private Long id;
    private Long userId;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private String portraitUrl;
    private Integer status;
    private String nickname;
    private Long createTime;
    private Long updateTime;

    public User() {
        id = null;
        userId = 0L;
        username = "";
        password = "";
        salt = "";
        phone = "";
        email = "";
        portraitUrl = "";
        status = 0;
        nickname = "";
        createTime = System.currentTimeMillis() / 1000;
    }

    public static class Status {
        public final static Integer UNUSE = 0;
        public final static Integer USED = 1;
    }
}