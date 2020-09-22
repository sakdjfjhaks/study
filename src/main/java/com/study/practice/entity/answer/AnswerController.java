package com.study.practice.entity.answer;

import com.study.practice.base.model.BaseResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 回答
 *
 * @author zhangkui
 * @date 2020-03-17
 */
@RestController
@Scope("request")
@RequestMapping("/answer")

public class AnswerController {

    @Resource
    private AnswerService answerService;


    @PostMapping(value = "/addNumAnswer")
    public BaseResponse addNumAnswer() {
        answerService.addNumAnswer();
        return new BaseResponse(true, "获取成功");
    }
}