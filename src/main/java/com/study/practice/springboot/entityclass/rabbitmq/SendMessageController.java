package com.study.practice.springboot.entityclass.rabbitmq;

import com.study.practice.base.service.DirectRabbitService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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