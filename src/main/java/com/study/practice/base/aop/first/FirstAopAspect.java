package com.study.practice.base.aop.first;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Map;

@Aspect   //定义一个切面
@Component
public class FirstAopAspect {
    // 定义切点Pointcut
    @Pointcut("@annotation(First))")
    public void first() {
    }

//    // 环绕通知
//    @Around("first()")
//    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around method");
//}
//    // 前置通知
//    @Before("first()")
//    public void beforeMethod(JoinPoint joinPoint) {
//        System.out.println("before method");
//    }

    // 后置通知
    @After("first()&&@annotation(First))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("after method");
    }

//    /**
//     *
//     * @param joinpoint
//     * @param rvt 返回值
//     */
//    @AfterReturning(pointcut = "first()", returning = "rvt")
//    public void afterReturningMethod(JoinPoint joinpoint, Object rvt) {
//        System.out.println("AfterReturning method");
//    }
//
//    // 异常通知
//    @AfterThrowing(pointcut = "first()")
//    public void afterThrowingMethod(JoinPoint joinPoint) {
//        System.out.println("AfterThrowing method");
//    }
}
