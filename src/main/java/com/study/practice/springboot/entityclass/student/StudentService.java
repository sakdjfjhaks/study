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
    * 查询多条数据
    *
    * @param student 查询参数
    * @return 对象列表
    */
    List<Student> pages(Student student);

    /**
    * 查询所有数据
    *
    * @return 对象列表
    */
    List<Student> getAll();

    /**
    * 新增数据
    *
    * @param student 实例对象
    * @param student    操作人
    * @return 实例对象
    */
    Student add(Student student);

    /**
    * 通过ID查询单条数据
    *
    * @param studentId 主键
    * @return 实例对象
    */
    Student getById(Long studentId);


    /**
    * 修改数据
    *
    * @param student 实例对象
    * @param student    操作人
    * @return 实例对象
    */
    Student update(Student student);

    /**
    * 通过主键删除数据
    *
    * @param studentId 主键
    * @return 是否成功
    */
    boolean deleteById(Long studentId);

}