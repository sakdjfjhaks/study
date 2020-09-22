package com.study.practice.entity.citycoordinate;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

/**
 * (CityCoordinate)表服务实现类
 *
 * @author wangkun
 * @date 2020-09-07
 */
@Service
public class CityCoordinateService {

    @Resource
    private CityCoordinateDao dao;

    /**
     * 查询多条数据
     *
     * @param cityCoordinate 查询参数
     * @return 对象列表
     */
    public List<CityCoordinate> pages(CityCoordinate cityCoordinate) {
        return this.dao.pages(cityCoordinate);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    public List<CityCoordinate> getAll() {
        return this.dao.getAll();
    }

    /**
     * 新增数据
     *
     * @param cityCoordinate 实例对象
     * @return 实例对象
     */
    public CityCoordinate add(CityCoordinate cityCoordinate) {
//        cityCoordinate.setCityId(SnowFlakeId.generateID());
        cityCoordinate.setCreateTime(Calendar.getInstance().getTime());
        this.dao.add(cityCoordinate);
        return this.getById(cityCoordinate.getCityId());
    }


    /**
     * 通过ID查询单条数据
     *
     * @param cityCoordinateId 主键
     * @return 实例对象
     */
    public CityCoordinate getById(Long cityCoordinateId) {
        return this.dao.getById(cityCoordinateId);
    }


    /**
     * 修改数据
     *
     * @param cityCoordinate 实例对象
     * @return 实例对象
     */
    public CityCoordinate update(CityCoordinate cityCoordinate) {
        this.dao.update(cityCoordinate);
        return this.getById(cityCoordinate.getCityId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cityCoordinateId 主键
     * @return 是否成功
     */
    public boolean deleteById(Long cityCoordinateId) {
        return this.dao.deleteById(cityCoordinateId) > 0;
    }

}