package com.z.springboot_thymeleaf.service;

import com.z.springboot_thymeleaf.entity.User;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/1 9:36
 */
public interface UserService {
    User login(String username, String password);
}
