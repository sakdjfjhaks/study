package com.study.practice.entity.method.test.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("requestController")
@Scope("request")
public class RequestController {

    @Autowired
    private TestService testService;
    int i = 0;

    @RequestMapping("test")
    public void test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(++i);
    }
}
