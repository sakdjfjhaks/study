package com.study.practice.base.aop.second;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect   //定义一个切面
@Component
public class SecondAopAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 定义切点Pointcut
    @Pointcut("execution(* com.study.practice..*.*(..))")
    public void excudeService() {
    }

    // 环绕通知
    @Around("excudeService()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("----环绕通知----");
        // pjp.proceed()获取原方法的返回值
        //当使用环绕通知时，这个方法必须调用，否则拦截到的方法就不会再执行了
        Object o = pjp.proceed();
        logger.info("----环绕通知----");
//        // 可以修改值
//        if (o != null && o.getClass().toString().indexOf("Map") > 0){
//            Map map = (Map) o;
//            map.put("作者","刘志强");
//            return map;
//        }
        return o;
    }

    // 后置通知
    @After("excudeService() && @annotation(monitor)")
    public void afterMethod(JoinPoint joinPoint, Second monitor) {
        logger.info("----后置通知----" );
    }

    // 前置通知
    @Before("excudeService()")
    public void beforeMethod(JoinPoint joinPoint) {
        logger.info("----前置通知----");
    }

    /**
     *
     * @param joinpoint
     * @param rvt 返回值
     */
    @AfterReturning(pointcut = "excudeService()", returning = "rvt")
    public void afterReturningMethod(JoinPoint joinpoint, Object rvt) {
        logger.info("----返回通知----");
    }

    // 异常通知
    @AfterThrowing(pointcut = "excudeService()")
    public void afterThrowingMethod(JoinPoint joinPoint) {
        logger.info("----异常通知----");
    }
}
