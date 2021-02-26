package com.z.springboot_thymeleaf.controller;

import com.z.springboot_thymeleaf.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/8 14:39
 */
@RestController
@RequestMapping("/redis")
public class RedisBookController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/test1")
    public void test1(){
        ValueOperations vops = redisTemplate.opsForValue();
        Book book = new Book();
        book.setId(10);
        book.setName("abcd");
        book.setAuthor("aaaa");
        vops.set("book",book);

        ValueOperations<String, String> vops1 = stringRedisTemplate.opsForValue();
        vops1.set("name","神雕侠侣");
        String name = vops1.get("name");
        System.out.println(name);

    }
}
