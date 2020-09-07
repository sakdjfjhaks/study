package com.study.practice.springboot.entityclass.answer;

import org.apache.ibatis.annotations.Mapper;

/**
 * 回答(Answer)表数据交互类
 *
 * @author zhangkui
 * @date $2020-03-17
 */
@Mapper
public interface AnswerDao {

    /**
     * 新增数据
     *
     * @param answer 实例对象
     * @return 影响行数
     */
    int add(Answer answer);


}
