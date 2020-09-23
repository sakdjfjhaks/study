package com.study.practice.entity.aop.aspect;

import com.study.practice.base.aop.first.First;
import com.study.practice.base.aop.message.Message;
import com.study.practice.base.aop.second.Second;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class FirstController {

    @First
    @RequestMapping("/first")
    public void first(){
        System.out.println("first method");
    }

    @Message
    @RequestMapping("/message")
    public void message(){
        System.out.println("message method");
    }

    @RequestMapping("/second")
    @Second
    public void second(){
        System.out.println("second method");
    }
}
