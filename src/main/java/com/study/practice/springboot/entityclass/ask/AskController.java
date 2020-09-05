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
        askService.addNumAsk();
        System.out.println("111");
        return new BaseResponse(true, "获取成功");
    }

    @PostMapping("/add")
    public BaseResponse add(@RequestBody Ask ask) {
        Ask newAsk = askService.add(ask);
        return new BaseResponse(true, "添加成功", newAsk);
    }


}