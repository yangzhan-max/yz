package com.graduation.chen.stuems.entity;

import java.sql.Date;

public class SecondExamInfo {
    private Integer id;

    private String statue;

    private String studentId;

    private String courseId;

    private Date examSecondTime;

    private String examSecondPlace;

    private Integer examSecondSection;

    private String examSecondInvigilator;

    private String examSecondType;

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
        this.examSecondPlace = examSecondPlace == null ? null : examSecondPlace.trim();
    }

    public Integer getExamSecondSection() {
        return examSecondSection;
    }

    public void setExamSecondSection(Integer examSecondSection) {
        this.examSecondSection = examSecondSection;
    }

    public String getExamSecondInvigilator() {
        return examSecondInvigilator;
    }

    public void setExamSecondInvigilator(String examSecondInvigilator) {
        this.examSecondInvigilator = examSecondInvigilator == null ? null : examSecondInvigilator.trim();
    }

    public String getExamSecondType() {
        return examSecondType;
    }

    public void setExamSecondType(String examSecondType) {
        this.examSecondType = examSecondType == null ? null : examSecondType.trim();
    }
}