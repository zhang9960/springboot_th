package com.z.springboot_thymeleaf.controller;

import com.z.springboot_thymeleaf.common.Result;
import com.z.springboot_thymeleaf.entity.User;
import com.z.springboot_thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/1 9:36
 */
@RestController
public class UserController{

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<User> login(@RequestParam("username") String username,@RequestParam("password") String password){

        User u=userService.login(username,password);
        if (null == u){
            return Result.error("-1","用户名或密码错误！");
        }
        return  Result.success(u);
    }
}
