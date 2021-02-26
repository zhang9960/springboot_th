package com.z.springboot_thymeleaf.controller;

import com.z.springboot_thymeleaf.entity.Book;
import com.z.springboot_thymeleaf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/5 10:39
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/")
//    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public void addBook(String name){
//        return "receive:"+name;
        Book book = new Book();
        book.setName("西游记");
        book.setAuthor("吴承恩");
        int i=bookService.addBook(book);
        System.out.println("addBook>>>>>>>>>>>>>"+i);
    }

    @DeleteMapping("/{id}")
//    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id){
        return String.valueOf(id);
    }
}
