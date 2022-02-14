package com.graduation.chen.stuems.model.dto;

import java.sql.Date;

public class SecondExamDTO {

    //状态
    private String statue;
    //课程名称
    private String courseName;
    //补考日期
    private Date examSecondTime;
    //补考地点
    private String examSecondPlace;
    //补考时间
    private Integer examSecondSection;
    //课程类型
    private String courseType;
    //监考老师
    private String examSecondInvigilator;
    //考试类型
    private String examSecondType;

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getExamSecondTime() {
        return examSecondTime;
    }

    public void setExamSecondTime(Date examSecondTime) {
        this.examSecondTime = examSecondTime;
    }

    public String getExamSecondPlace() {
        return examSecondPlace;
    }

    public void setExamSecondPlace(String examSecondPlace) {
        this.examSecondPlace = examSecondPlace;
    }

    public Integer getExamSecondSection() {
        return examSecondSection;
    }

    public void setExamSecondSection(Integer examSecondSection) {
        this.examSecondSection = examSecondSection;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getExamSecondInvigilator() {
        return examSecondInvigilator;
    }

    public void setExamSecondInvigilator(String examSecondInvigilator) {
        this.examSecondInvigilator = examSecondInvigilator;
    }

    public String getExamSecondType() {
        return examSecondType;
    }

    public void setExamSecondType(String examSecondType) {
        this.examSecondType = examSecondType;
    }
}
