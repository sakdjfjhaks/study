package com.study.practice.entity.citycoordinate;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (CityCoordinate)表数据交互类
 *
 * @author wangkun
 * @date $2020-09-07
 */
@Mapper
public interface CityCoordinateDao {

    /**
     * 查询多条数据
     *
     * @param cityCoordinate 查询参数
     * @return 对象列表
     */
    List<CityCoordinate> pages(CityCoordinate cityCoordinate);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<CityCoordinate> getAll();

    /**
     * 新增数据
     *
     * @param cityCoordinate 实例对象
     * @return 影响行数
     */
    int add(CityCoordinate cityCoordinate);

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    CityCoordinate getById(Long cityId);

    /**
     * 修改数据
     *
     * @param cityCoordinate 实例对象
     * @return 影响行数
     */
    int update(CityCoordinate cityCoordinate);

    /**
     * 通过主键删除数据
     *
     * @param cityId 主键
     * @return 影响行数
     */
    int deleteById(Long cityId);
}
