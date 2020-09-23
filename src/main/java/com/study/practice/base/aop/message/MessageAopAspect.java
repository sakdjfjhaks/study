package com.study.practice.base.aop.message;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAopAspect {

    @Pointcut("@annotation(Message))")
    public void message(){

    }
//    // 环绕通知
//    @Around("message()&&@annotation(Message))")
//    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("message around method");
//    }


//
//    // 后置通知
//    @After("message()")
//    public void afterMethod(JoinPoint joinPoint) {
//        System.out.println("message after method");
//    }

//    /**
//     *
//     * @param joinpoint
//     * @param rvt 返回值
//     */
//    @AfterReturning(pointcut = "message()", returning = "rvt")
//    public void afterReturningMethod(JoinPoint joinpoint, Object rvt) {
//        System.out.println("message AfterReturning method");
//    }

//    // 异常通知
//    @AfterThrowing(pointcut = "message()")
//    public void afterThrowingMethod(JoinPoint joinPoint) {
//        System.out.println("message AfterThrowing method");
//    }
}
