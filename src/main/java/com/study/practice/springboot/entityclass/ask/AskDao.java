package com.study.practice.springboot.entityclass.ask;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 提问(Ask)表数据交互类
 *
 * @author zhangkui
 * @date $2020-04-26
 */
@Mapper
public interface AskDao {

    /**
     * 查询多条数据
     *
     * @param ask 查询参数
     * @return 对象列表
     */
    List<Ask> pages(Ask ask);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<Ask> getAll();

    /**
     * 新增数据
     *
     * @param ask 实例对象
     * @return 影响行数
     */
    int add(Ask ask);

    /**
     * 通过ID查询单条数据
     *
     * @param ask 主键
     * @return 实例对象
     */
    Ask getById(Ask ask);

    /**
     * 修改数据
     *
     * @param ask 实例对象
     * @return 影响行数
     */
    int update(Ask ask);

    /**
     * 通过主键删除数据
     *
     * @param askId 主键
     * @return 影响行数
     */
    int deleteById(Long askId);

    /**
     * 回答数量+1
     *
     * @param ask
     */
    void updateAnswerNum(Ask ask);

    /**
     * 浏览量+1
     *
     * @param ask
     */
    void updatVisitNum(Ask ask);
}
