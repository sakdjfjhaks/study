package com.study.practice.entity.addtest;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (AddTest)表数据交互类
 *
 * @author wangkun
 * @date $2020-09-07
 */
@Mapper
public interface AddTestDao {

    /**
     * 查询多条数据
     *
     * @param addTest 查询参数
     * @return 对象列表
     */
    List<AddTest> pages(AddTest addTest);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<AddTest> getAll();

    /**
     * 新增数据
     *
     * @param addTest 实例对象
     * @return 影响行数
     */
    int add(AddTest addTest);

    void addList(List<AddTest> addTestList);

    /**
     * 通过ID查询单条数据
     *
     * @param addTestId 主键
     * @return 实例对象
     */
    AddTest getById(Long addTestId);

    /**
     * 修改数据
     *
     * @param addTest 实例对象
     * @return 影响行数
     */
    int update(AddTest addTest);

    /**
     * 通过主键删除数据
     *
     * @param addTestId 主键
     * @return 影响行数
     */
    int deleteById(Long addTestId);
}
