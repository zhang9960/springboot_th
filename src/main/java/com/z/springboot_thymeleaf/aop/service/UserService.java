package com.z.springboot_thymeleaf.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/7 11:38
 */
@Service
public class UserService {

    public String getUserById(Integer id){
        System.out.println("get.............");
        return "user";
    }

    public void deleteUserById(Integer id){
        System.out.println("delete....");
    }
}
