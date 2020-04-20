package com.study.practice.springboot.entityclass.student;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

/**
* 
*
* @author wangkun
* @date  2020-04-20
*/
@ApiModel(description = "")
@Data
public class Student  {
        @ApiModelProperty(value = "", name = "studentId", example = "")
        private Integer studentId;
        @ApiModelProperty(value = "", name = "studentPhone", example = "")
        private Integer studentPhone;
        @ApiModelProperty(value = "", name = "studentPassword", example = "")
        private String studentPassword;
        @ApiModelProperty(value = "", name = "address", example = "")
        private Integer address;
        @ApiModelProperty(value = "", name = "parentFather", example = "")
        private Integer parentFather;
        @ApiModelProperty(value = "", name = "parentMother", example = "")
        private Integer parentMother;
        @ApiModelProperty(value = "", name = "admissionTime", example = "")
        private Date admissionTime;
        @ApiModelProperty(value = "", name = "graduationTime", example = "")
        private Date graduationTime;
        @ApiModelProperty(value = "", name = "studentName", example = "")
        private String studentName;
        @ApiModelProperty(value = "", name = "studentSchool", example = "")
        private Integer studentSchool;
}