package com.z.springboot_thymeleaf.service;

import com.z.springboot_thymeleaf.entity.Book;
import com.z.springboot_thymeleaf.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/7 16:29
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public int addBook(Book book) {
        return bookMapper.add(book);
    }
}
