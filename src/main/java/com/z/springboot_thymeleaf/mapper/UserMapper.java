package com.z.springboot_thymeleaf.mapper;

import com.z.springboot_thymeleaf.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/1 9:36
 */
@Repository
public interface UserMapper {
    User select(@Param("username") String username, @Param("password") String password);
}
