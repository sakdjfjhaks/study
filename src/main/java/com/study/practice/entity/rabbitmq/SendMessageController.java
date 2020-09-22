package com.study.practice.entity.rabbitmq;

import com.study.practice.base.service.DirectRabbitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : JCccc
 * @CreateTime : 2019/9/3
 * @Description :
 **/
@RestController
public class SendMessageController {
    @Resource
    private DirectRabbitService directRabbitService;

    @GetMapping("/sendDirectMessage")
    public String sendDirectMessage() {
        directRabbitService.sendDirectMessage("你好");
        return "ok";
    }


}