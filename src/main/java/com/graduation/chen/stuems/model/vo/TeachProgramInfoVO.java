package com.graduation.chen.stuems.model.vo;


import java.sql.Date;


public class TeachProgramInfoVO {
    private Integer id;

    private String studentId;

    private String courseId;

    private String signYear;

    private Integer signTerm;

    private Date signTime;

    private String programType;

    private Boolean Accept;

    private String courseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getSignYear() {
        return signYear;
    }

    public void setSignYear(String signYear) {
        this.signYear = signYear;
    }

    public Integer getSignTerm() {
        return signTerm;
    }

    public void setSignTerm(Integer signTerm) {
        this.signTerm = signTerm;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public Boolean getAccept() {
        return Accept;
    }

    public void setAccept(Boolean accept) {
        Accept = accept;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}