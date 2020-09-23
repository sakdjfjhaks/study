package com.study.practice.base.aop.second;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect   //定义一个切面
@Component
public class SecondAopAspect {
    // 定义切点Pointcut
    @Pointcut("execution(* com.study.practice.*.*(..))")
    public void second() {
    }

    // 环绕通知
    @Around("second()")
    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around method");
}
    // 前置通知
    @Before("second()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("before method");
    }

    // 后置通知
    @After("second()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("after method");
    }

    /**
     *
     * @param joinpoint
     * @param rvt 返回值
     */
    @AfterReturning(pointcut = "second()", returning = "rvt")
    public void afterReturningMethod(JoinPoint joinpoint, Object rvt) {
        System.out.println("AfterReturning method");
    }

    // 异常通知
    @AfterThrowing(pointcut = "second()")
    public void afterThrowingMethod(JoinPoint joinPoint) {
        System.out.println("AfterThrowing method");
    }
}
