package com.z.springboot_thymeleaf.mapper;

import com.z.springboot_thymeleaf.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/7 16:27
 */
@Repository
public interface BookMapper {
    int add(Book book);
}
