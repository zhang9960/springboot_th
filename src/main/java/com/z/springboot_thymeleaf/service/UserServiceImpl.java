package com.z.springboot_thymeleaf.service;

import com.z.springboot_thymeleaf.entity.User;
import com.z.springboot_thymeleaf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/1 9:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.select(username,password);
    }
}
