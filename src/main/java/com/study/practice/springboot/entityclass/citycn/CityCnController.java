package com.study.practice.springboot.entityclass.citycn;

import com.study.practice.base.model.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangkun
 * @date 2020-09-07
 */
@RestController
@RequestMapping("/citycn")
public class CityCnController {

    @Resource
    private CityCnService service;

//    @PostMapping(value = "/pages")
//    public BaseResponse pages(@RequestBody CityCn cityCn) {
//        PageHelper.startPage(cityCn .getStart(), cityCn .getLength());
//        List<CityCn> list = service.pages(cityCn);
//        return new BaseResponse(true, "获取成功", list, ((Page) list).getTotal());
//    }

    @PostMapping(value = "/getAll")
    public BaseResponse getAll() {
        List<CityCn> list = this.service.getAll();
        return new BaseResponse(true, "获取成功", list);
    }

    @PostMapping("/add")
    public BaseResponse add(@RequestBody CityCn cityCn) {
        CityCn newCityCn = service.add(cityCn);
        return new BaseResponse(true, "添加成功", newCityCn);
    }

    @PostMapping("/detail")
    public BaseResponse detail(@RequestBody CityCn cityCn) {
        CityCn newCityCn = service.getById(cityCn.getId());
        if (newCityCn != null) {
            return new BaseResponse(true, "查询成功", newCityCn);
        } else {
            return new BaseResponse(false, "没有找到");
        }
    }

    @PostMapping("/update")
    public BaseResponse update(@RequestBody CityCn cityCn) {
        CityCn newCityCn = service.update(cityCn);
        return new BaseResponse(true, "修改成功", newCityCn);
    }

    @PostMapping("/delete")
    public BaseResponse delete(@RequestBody CityCn cityCn) {
        service.deleteById(cityCn.getId());
        return new BaseResponse(true, "删除成功");
    }
}