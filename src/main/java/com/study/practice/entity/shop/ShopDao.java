package com.study.practice.entity.shop;


import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangkun
 * @date 2019/05/15
 */
@Mapper
public interface ShopDao {


    Shop add(Shop shop);

}
