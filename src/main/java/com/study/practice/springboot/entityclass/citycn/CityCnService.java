package com.study.practice.springboot.entityclass.citycn;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CityCn)表服务实现类
 *
 * @author wangkun
 * @date 2020-09-07
 */
@Service
public class CityCnService {

    @Resource
    private CityCnDao dao;

    /**
     * 查询多条数据
     *
     * @param cityCn 查询参数
     * @return 对象列表
     */
    public List<CityCn> pages(CityCn cityCn) {
        return this.dao.pages(cityCn);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    public List<CityCn> getAll() {
        return this.dao.getAll();
    }

    /**
     * 新增数据
     *
     * @param cityCn 实例对象
     * @return 实例对象
     */
    public CityCn add(CityCn cityCn) {
        this.dao.add(cityCn);
        return this.getById(cityCn.getId());
    }


    /**
     * 通过ID查询单条数据
     *
     * @param cityCnId 主键
     * @return 实例对象
     */
    public CityCn getById(Integer cityCnId) {
        return this.dao.getById(cityCnId);
    }


    /**
     * 修改数据
     *
     * @param cityCn 实例对象
     * @return 实例对象
     */
    public CityCn update(CityCn cityCn) {
        this.dao.update(cityCn);
        return this.getById(cityCn.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cityCnId 主键
     * @return 是否成功
     */
    public boolean deleteById(Integer cityCnId) {
        return this.dao.deleteById(cityCnId) > 0;
    }

}