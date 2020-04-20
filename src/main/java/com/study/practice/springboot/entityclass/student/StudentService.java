package com.study.practice.springboot.entityclass.student;

import java.util.List;
import com.study.practice.springboot.entityclass.student.Student;

/**
* (Student)表服务接口
*
* @author wangkun
* @date  2020-04-20
*/
public interface StudentService {


    /**
    * 查询所有数据
    *
    * @return 对象列表
    */
    List<Student> getAll();

}