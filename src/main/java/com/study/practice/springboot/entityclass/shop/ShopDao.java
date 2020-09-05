package com.study.practice.springboot.entityclass.shop;



import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 *
 * @author wangkun
 * @date  2019/05/15
 */
@Mapper
public interface ShopDao  {


    Integer add(Shop shop);

}
