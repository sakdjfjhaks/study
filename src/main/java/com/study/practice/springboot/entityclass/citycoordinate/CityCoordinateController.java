package com.study.practice.springboot.entityclass.citycoordinate;


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
@RequestMapping("/cityCoordinate")
public class CityCoordinateController {

    @Resource
    private CityCoordinateService service;

//    @PostMapping(value = "/pages")
//    public BaseResponse pages(@RequestBody CityCoordinate cityCoordinate) {
//        PageHelper.startPage(cityCoordinate .getStart(), cityCoordinate .getLength());
//        List<CityCoordinate> list = service.pages(cityCoordinate);
//        return new BaseResponse(true, "获取成功", list, ((Page) list).getTotal());
//    }


    @PostMapping(value = "/getAll")
    public BaseResponse getAll() {
        List<CityCoordinate> list = this.service.getAll();
        return new BaseResponse(true, "获取成功", list);
    }


    @PostMapping("/add")
    public BaseResponse add(@RequestBody CityCoordinate cityCoordinate) {
        CityCoordinate newCityCoordinate = service.add(cityCoordinate);
        return new BaseResponse(true, "添加成功", newCityCoordinate);
    }


    @PostMapping("/detail")
    public BaseResponse detail(@RequestBody CityCoordinate cityCoordinate) {
        CityCoordinate newCityCoordinate = service.getById(cityCoordinate.getCityId());
        if (newCityCoordinate != null) {
            return new BaseResponse(true, "查询成功", newCityCoordinate);
        } else {
            return new BaseResponse(false, "没有找到");
        }
    }


    @PostMapping("/update")
    public BaseResponse update(@RequestBody CityCoordinate cityCoordinate) {
        CityCoordinate newCityCoordinate = service.update(cityCoordinate);
        return new BaseResponse(true, "修改成功", newCityCoordinate);
    }


    @PostMapping("/delete")
    public BaseResponse delete(@RequestBody CityCoordinate cityCoordinate) {
        service.deleteById(cityCoordinate.getCityId());
        return new BaseResponse(true, "删除成功");
    }

}