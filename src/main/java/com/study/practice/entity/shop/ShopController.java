package com.study.practice.entity.shop;

import com.study.practice.base.model.BaseResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangkun
 * @date 2019/05/15
 */
@RestController
@Scope("request")
@RequestMapping("/shop")

public class ShopController {

    @Resource
    private ShopService service;


    /**
     * 详情
     **/
    @PostMapping("/detail")
    public BaseResponse detail(@RequestBody Shop shop) {
        return null;
    }


}
