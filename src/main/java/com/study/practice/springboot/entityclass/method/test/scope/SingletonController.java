package com.study.practice.springboot.entityclass.method.test.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("singletonController")
@Scope("singleton")
public class SingletonController {

    @Autowired
    private TestService testService;
    int i = 0;

    @RequestMapping("test")
    public void test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(++i);
    }
}
