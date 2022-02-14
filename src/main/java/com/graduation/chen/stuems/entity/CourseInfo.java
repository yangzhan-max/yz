package com.graduation.chen.stuems.entity;

import java.sql.Date;

public class CourseInfo {
    //课程编号
    private String courseId;
    //课程名称
    private String courseName;
    //课程地点
    private String coursePlace;
    //课程教师
    private String courseTeacher;
    //课程时间
    private Integer courseWeek;
    //课程节次
    private Integer courseSection;
    //课程周期
    private String courseCycle;
    //课程类型
    private String courseType;
    //课程学分
    private Double courseCredit;
    //课程开始时间
    private Date courseBegin;
    //课程所属系别
    private String courseBelong;


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCoursePlace() {
        return coursePlace;
    }

    public void setCoursePlace(String coursePlace) {
        this.coursePlace = coursePlace == null ? null : coursePlace.trim();
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher == null ? null : courseTeacher.trim();
    }

    public Integer getCourseWeek() {
        return courseWeek;
    }

    public void setCourseWeek(Integer courseWeek) {
        this.courseWeek = courseWeek;
    }

    public Integer getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(Integer courseSection) {
        this.courseSection = courseSection;
    }

    public String getCourseCycle() {
        return courseCycle;
    }

    public void setCourseCycle(String courseCycle) {
        this.courseCycle = courseCycle == null ? null : courseCycle.trim();
    }

    public Double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Double courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Date getCourseBegin() {
        return courseBegin;
    }

    public void setCourseBegin(Date courseBegin) {
        this.courseBegin = courseBegin;
    }

    public String getCourseBelong() {
        return courseBelong;
    }

    public void setCourseBelong(String courseBelong) {
        this.courseBelong = courseBelong;
    }
}