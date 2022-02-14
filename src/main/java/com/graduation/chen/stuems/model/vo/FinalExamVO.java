package com.graduation.chen.stuems.model.vo;

import java.sql.Date;

public class FinalExamVO {

    //课程名称
    private String courseName;
    //课程学分
    private Double courseCredit;

    //学期
    private Integer courseTerm;
    //学年
    private String courseYear;

    //学院
    private String college;
    //专业
    private String major;
    //系别
    private String department;
    //班级
    private String classes;

    //终极补考状态
    private String statue;
    //终极补考日期
    private Date finalExamTime;
    //终极补考地点
    private String finalExamPlace;
    //终极补考时间
    private String finalExamSection;
    //终极补考监考教师
    private String finalExamInvigilator;
    //终极补考类型
    private String finalExamType;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Double courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getCourseTerm() {
        return courseTerm;
    }

    public void setCourseTerm(Integer courseTerm) {
        this.courseTerm = courseTerm;
    }

    public String getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(String courseYear) {
        this.courseYear = courseYear;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
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
        this.finalExamPlace = finalExamPlace;
    }


    public String getFinalExamSection() {
        return finalExamSection;
    }

    public void setFinalExamSection(Integer finalExamSection) {

        String courseSectionVO = "";
        switch (finalExamSection) {
            case 1:
                courseSectionVO = "1-2节";
                break;
            case 2:
                courseSectionVO = "3-4节";
                break;
            case 3:
                courseSectionVO = "5-6节";
                break;
            case 4:
                courseSectionVO = "7-8节";
                break;
            case 5:
                courseSectionVO = "9-10节";
                break;
            case 6:
                courseSectionVO = "11-12节";
                break;
            case 7:
                courseSectionVO = "13-14节";
                break;
            default:
                courseSectionVO = "";
        }
        this.finalExamSection = courseSectionVO;
    }


    public String getFinalExamInvigilator() {
        return finalExamInvigilator;
    }

    public void setFinalExamInvigilator(String finalExamInvigilator) {
        this.finalExamInvigilator = finalExamInvigilator;
    }

    public String getFinalExamType() {
        return finalExamType;
    }

    public void setFinalExamType(String finalExamType) {
        this.finalExamType = finalExamType;
    }

    @Override
    public String toString() {
        return "FinalExamVO{" +
                "courseName='" + courseName + '\'' +
                ", courseCredit=" + courseCredit +
                ", courseTerm=" + courseTerm +
                ", courseYear='" + courseYear + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                ", classes='" + classes + '\'' +
                ", statue='" + statue + '\'' +
                ", finalExamTime=" + finalExamTime +
                ", finalExamPlace='" + finalExamPlace + '\'' +
                ", finalExamSection=" + finalExamSection +
                ", finalExamInvigilator='" + finalExamInvigilator + '\'' +
                ", finalExamType='" + finalExamType + '\'' +
                '}';
    }
}
