package com.study.practice.entity.student;


import java.util.Date;

/**
 * @author wangkun
 * @date 2020-04-20
 */

public class Student {

    private Integer studentId;

    private Integer studentPhone;

    private String studentPassword;

    private Integer address;

    private Integer parentFather;

    private Integer parentMother;

    private Date admissionTime;

    private Date graduationTime;

    private String studentName;

    private Integer studentSchool;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(Integer studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getParentFather() {
        return parentFather;
    }

    public void setParentFather(Integer parentFather) {
        this.parentFather = parentFather;
    }

    public Integer getParentMother() {
        return parentMother;
    }

    public void setParentMother(Integer parentMother) {
        this.parentMother = parentMother;
    }

    public Date getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(Date admissionTime) {
        this.admissionTime = admissionTime;
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(Integer studentSchool) {
        this.studentSchool = studentSchool;
    }
}