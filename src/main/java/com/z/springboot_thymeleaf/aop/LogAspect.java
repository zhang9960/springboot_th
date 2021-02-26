package com.z.springboot_thymeleaf.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/2/7 11:40
 */
@Component
public class LogAspect {

    @Pointcut("execution(* com.z.springboot_thymeleaf.aop.service.*.*(..))")
    public void pc1(){
    }

    @Before(value = "pc1()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法开始执行了》》》》》》》》");
    }

    @After(value = "pc1()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法开始执行了》》》》》》》》");
    }

    @AfterReturning(value = "pc1()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的返回值为"+result);
    }

    @AfterThrowing(value = "pc1()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法异常了，异常为"+e);
    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed();
    }
}
