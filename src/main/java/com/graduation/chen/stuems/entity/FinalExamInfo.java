package com.graduation.chen.stuems.entity;

import java.util.Date;

public class FinalExamInfo {
    //终极补考编号
    private Integer id;
    //终极补考状态
    private String statue;
    //学号
    private String studentId;
    //课程编号
    private String courseId;
    //终极补考日期
    private Date finalExamTime;
    //终极补考地点
    private String finalExamPlace;
    //终极补考时间
    private Integer finalExamSection;
    //终极补考监考教师
    private String finalExamInvigilator;
    //终极补考类型
    private String finalExamType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue == null ? null : statue.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public Date getFinalExamTime() {
        return finalExamTime;
    }

    public void setFinalExamTime(Date finalExamTime) {
        this.finalExamTime = finalExamTime;
    }

    public String getFinalExamPlace() {
        return finalExamPlace;
    }

    public void setFinalExamPlace(String finalExamPlace) {
        this.finalExamPlace = finalExamPlace == null ? null : finalExamPlace.trim();
    }

    public Integer getFinalExamSection() {
        return finalExamSection;
    }

    public void setFinalExamSection(Integer finalExamSection) {
        this.finalExamSection = finalExamSection;
    }

    public String getFinalExamInvigilator() {
        return finalExamInvigilator;
    }

    public void setFinalExamInvigilator(String finalExamInvigilator) {
        this.finalExamInvigilator = finalExamInvigilator == null ? null : finalExamInvigilator.trim();
    }

    public String getFinalExamType() {
        return finalExamType;
    }

    public void setFinalExamType(String finalExamType) {
        this.finalExamType = finalExamType == null ? null : finalExamType.trim();
    }
}