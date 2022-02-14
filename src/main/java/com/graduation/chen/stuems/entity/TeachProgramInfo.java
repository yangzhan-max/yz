package com.graduation.chen.stuems.entity;


import java.sql.Date;

public class TeachProgramInfo {
    private Integer id;

    private String studentId;

    private String courseId;

    private String signYear;

    private Integer signTerm;

    private Date signTime;

    private String programType;

    private Boolean isAccept;

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
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getSignYear() {
        return signYear;
    }

    public void setSignYear(String signYear) {
        this.signYear = signYear == null ? null : signYear.trim();
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
        this.programType = programType == null ? null : programType.trim();
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }
}