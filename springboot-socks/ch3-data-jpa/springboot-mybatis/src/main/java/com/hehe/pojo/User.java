package com.hehe.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String userId;
    private String username;
    private String password;

    public User() {

    }

    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
