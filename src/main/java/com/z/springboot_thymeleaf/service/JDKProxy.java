package com.z.springboot_thymeleaf.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/22 15:43
 */
public class JDKProxy implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
