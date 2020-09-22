package com.study.practice.entity.student;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author wangkun
 * @date 2020-04-20
 */
public interface StudentService {


    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<Student> getAll();

}