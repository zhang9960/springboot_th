package com.z.springboot_thymeleaf.entity;

import org.apache.ibatis.type.Alias;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/1/28 15:49
 */
@Alias("user")
public class User {
    private Integer id;
    private String username;
    private String password;
    private String role;

    public User() {
    }

    public User(Integer id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
