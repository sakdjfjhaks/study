package com.study.practice.springboot.entityclass.student;

import com.study.practice.springboot.entityclass.student.Student;
import com.study.practice.springboot.entityclass.student.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
*
* 
* @author wangkun
* @date  2020-04-20
*/
@RestController
@RequestMapping("/student")
@Api(value = "", tags = "操作接口")
public class StudentController {

    @Resource
    private StudentService service;


    @ApiOperation(value = "获取所有", notes = "获取所有")
    @PostMapping(value = "/getAll")
    public List<Student> getAll() {
        List<Student> list = this.service.getAll();
        return list;
    }
    @ApiOperation(value = "测试", notes = "测试")
    @PostMapping(value = "/test")
    public String test() {
        return "list";
    }

}