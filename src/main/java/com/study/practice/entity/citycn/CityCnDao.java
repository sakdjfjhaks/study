package com.study.practice.entity.citycn;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (CityCn)表数据交互类
 *
 * @author wangkun
 * @date $2020-09-07
 */
@Mapper
public interface CityCnDao {

    /**
     * 查询多条数据
     *
     * @param cityCn 查询参数
     * @return 对象列表
     */
    List<CityCn> pages(CityCn cityCn);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<CityCn> getAll();

    /**
     * 新增数据
     *
     * @param cityCn 实例对象
     * @return 影响行数
     */
    int add(CityCn cityCn);

    /**
     * 通过ID查询单条数据
     *
     * @param cityCnId 主键
     * @return 实例对象
     */
    CityCn getById(Integer cityCnId);

    /**
     * 修改数据
     *
     * @param cityCn 实例对象
     * @return 影响行数
     */
    int update(CityCn cityCn);

    /**
     * 通过主键删除数据
     *
     * @param cityCnId 主键
     * @return 影响行数
     */
    int deleteById(Integer cityCnId);
}
