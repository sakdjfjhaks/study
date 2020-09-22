package com.study.practice.entity.answer;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 回答(Answer)表服务实现类
 *
 * @author zhangkui
 * @date 2020-03-17
 */
@Service
public class AnswerService {

    @Resource
    private AnswerDao dao;

    /**
     * 添加多条数据
     *
     * @return 对象列表
     */

    public void addNumAnswer() {
        Answer answer = new Answer();
        for (int i = 0; i < 2000000; i++) {
            answer.setAnswerContent("2020,13,38," + i + ",回答测试");
            dao.add(answer);
        }
    }

}