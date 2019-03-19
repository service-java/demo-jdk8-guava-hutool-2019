package com.hehe.mapper;

import com.hehe.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Results({
        @Result(property = "userId", column = "USER_ID"),
        @Result(property = "username", column = "USERNAME"),
        @Result(property = "password", column = "PASSWORD"),
//        @Result(property = "mobileNum", column = "PHONE_NUM")
    })
    @Select("select * from t_user")
    List<User> list();

    @Select("select * from t_user where username like #{username}")
    List<User> findByUsername(String username);

    @Select("select * from t_user where user_id like #{userId}")
    User getOne(String userId);

    @Delete("delete from t_user where user_id like #{userId}")
    int delete(String userId);

}
