package com.chat.httpchat.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @Author: gaofeng
 * @Date: 2019-01-11
 * @Description:
 */
@Component
@Mapper
public interface UserMapper {

    /**
     * @Author:gaofeng
     * @Date:2018/7/2
     * @Description: 保存用户
     **/
    @Insert("INSERT INTO user(userId, username, password, salt, phone, email, portraitUrl, status, createTime) values" +
            "(#{userId}, #{username}, #{password}, #{salt}, #{phone}, #{email}, #{portraitUrl}, #{status}, " +
            "#{createTime})")
    public Integer saveUser(User user);

    /**
     * @Author:gaofeng
     * @Date:2018/7/2
     * @Description: 根据手机号查找用户
     **/
    @Select("SELECT * FROM user WHERE phone=#{phone}")
    public User selectUserByPhone(String phone);

    /**
     * @Author:gaofeng
     * @Date:2018/7/2
     * @Description: 根据用户名或者手机号查找用户
     **/
    @Select("SELECT * FROM user WHERE phone=#{0} OR username=#{1}")
    public User selectUserByPhoneOrUsername(String phone, String username);

}
