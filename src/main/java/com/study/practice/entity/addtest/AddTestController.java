package com.study.practice.entity.addtest;


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
@RequestMapping("/addtest")
public class AddTestController {

    @Resource
    private AddTestService service;


    @PostMapping(value = "/getAll")
    public BaseResponse getAll() {
        List<AddTest> list = this.service.getAll();
        return new BaseResponse(true, "获取成功", list);
    }


    @PostMapping("/add")
    public BaseResponse add(@RequestBody AddTest addTest) {
        AddTest newAddTest = service.add(addTest);
        return new BaseResponse(true, "添加成功", newAddTest);
    }

    @PostMapping("/addList")
    public BaseResponse addList() {
        service.addList();
        return new BaseResponse(true, "添加成功");
    }

    @PostMapping("/addListDisorder")
    public BaseResponse addListDisorder() {
        service.addListDisorder();
        return new BaseResponse(true, "添加成功");
    }


    @PostMapping("/detail")
    public BaseResponse detail(@RequestBody AddTest addTest) {
        AddTest newAddTest = service.getById(addTest.getAddTestId());
        if (newAddTest != null) {
            return new BaseResponse(true, "查询成功", newAddTest);
        } else {
            return new BaseResponse(false, "没有找到");
        }
    }


    @PostMapping("/update")
    public BaseResponse update(@RequestBody AddTest addTest) {
        AddTest newAddTest = service.update(addTest);
        return new BaseResponse(true, "修改成功", newAddTest);
    }


    @PostMapping("/delete")
    public BaseResponse delete(@RequestBody AddTest addTest) {
        service.deleteById(addTest.getAddTestId());
        return new BaseResponse(true, "删除成功");
    }

}