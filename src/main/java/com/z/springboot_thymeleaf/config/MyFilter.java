package com.z.springboot_thymeleaf.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/5 15:19
 */
@WebFilter
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter >>> init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter >>> doFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter >>> destroy");
    }
}
