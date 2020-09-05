package com.study.practice.springboot.entityclass.student;

import org.springframework.web.bind.annotation.PostMapping;
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

public class StudentController {

    @Resource
    private StudentService service;



    @PostMapping(value = "/getAll")
    public List<Student> getAll() {
        List<Student> list = this.service.getAll();
        return list;
    }

    @PostMapping(value = "/test")
    public String test() {
        return "list";
    }

}