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
   * @return 影响行数
   */
   int add(Student student);

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
   * @return 影响行数
   */
   int update(Student student);

   /**
   * 通过主键删除数据
   *
   * @param studentId 主键
   * @return 影响行数
   */
   int deleteById(Long studentId);
}
