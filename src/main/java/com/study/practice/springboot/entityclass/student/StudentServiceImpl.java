package com.study.practice.springboot.entityclass.student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
* (Student)表服务实现类
*
* @author wangkun
* @date  2020-04-20
*/
@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao dao;

    /**
    * 查询多条数据
    *
    * @param student 查询参数
    * @return 对象列表
    */
    @Override
    public List<Student> pages(Student student){
        return this.dao.pages(student);
    }

    /**
    * 查询所有数据
    *
    * @return 对象列表
    */
    @Override
    public List<Student> getAll(){
        return this.dao.getAll();
    }

    /**
    * 新增数据
    *
    * @param student 实例对象
    * @param student    操作人
    * @return 实例对象
    */
    @Override
    public Student add(Student student){
        this.dao.add(student);
        return  this.getById(student.getStudentId());
    }


    /**
    * 通过ID查询单条数据
    *
    * @param studentId 主键
    * @return 实例对象
    */
    @Override
    public Student getById(Long studentId){
        return this.dao.getById(studentId);
    }


    /**
    * 修改数据
    *
    * @param student 实例对象
    * @return 实例对象
    */
    @Override
    public Student update(Student student){
        this.dao.update(student);
        return this.getById(student.getStudentId());
    }

    /**
    * 通过主键删除数据
    *
    * @param studentId 主键
    * @return 是否成功
    */
    @Override
    public boolean deleteById(Long studentId){
        return this.dao.deleteById(studentId)>0;
    }

}