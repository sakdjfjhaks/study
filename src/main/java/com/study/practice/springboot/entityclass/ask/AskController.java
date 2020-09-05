package com.study.practice.springboot.entityclass.ask;

import com.study.practice.base.model.BaseResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 提问
 *
 * @author zhangkui
 * @date 2020-04-26
 */
@RestController
@Scope("request")
@RequestMapping("/ask")

public class AskController {

    @Resource
    private AskService askService;


    @PostMapping(value = "/addNumAsk")
    public BaseResponse addNumAsk() {
        askService.addNumAsk(20000);
        System.out.println("111");
        return new BaseResponse(true, "获取成功");
    }

    @PostMapping("/addNumAskContent")
    public BaseResponse addNumAskContent() {
        askService.addNumAskContent(10000);
        return new BaseResponse(true, "添加成功");
    }


}