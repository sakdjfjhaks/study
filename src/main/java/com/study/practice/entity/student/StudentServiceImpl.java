package com.study.practice.entity.student;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表服务实现类
 *
 * @author wangkun
 * @date 2020-04-20
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao dao;

    public List<Student> getAll() {
        return this.dao.getAll();
    }


}