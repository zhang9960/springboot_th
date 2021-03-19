package com.z.springboot_thymeleaf.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/20 15:27
 */
public class DateDemo {
   //在demo中添加了一行注释
    //第二次在demo中添加注释
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
