package com.study.practice.springboot.entityclass.student;

import  com.study.practice.springboot.entityclass.student.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Student)表数据交互类
 * @author wangkun
 * @date  $2020-04-20
 */
@Mapper
public interface StudentDao {


  /**
  * 查询所有数据
  *
  * @return 对象列表
  */
  List<Student> getAll();
}
