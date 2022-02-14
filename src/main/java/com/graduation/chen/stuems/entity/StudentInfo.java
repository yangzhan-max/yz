package com.graduation.chen.stuems.entity;

import java.sql.Date;

/**
 * 学籍信息
 */
public class StudentInfo {
    //学号
    private String studentId;
    //入学时间
    private Date joinTime;
    //入学类型
    private String joinType;
    //学制
    private String education;
    //学院
    private String college;
    //专业
    private String major;
    //系别
    private String department;
    //班级
    private String classes;
    //是否在读
    private String isStudy;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getJoinType() {
        return joinType;
    }

    public void setJoinType(String joinType) {
        this.joinType = joinType == null ? null : joinType.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getIsStudy() {
        return isStudy;
    }

    public void setIsStudy(String isStudy) {
        this.isStudy = isStudy;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentId='" + studentId + '\'' +
                ", joinTime=" + joinTime +
                ", joinType='" + joinType + '\'' +
                ", education='" + education + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                ", classes='" + classes + '\'' +
                ", isStudy='" + isStudy + '\'' +
                '}';
    }
}