package com.graduation.chen.stuems.model.vo;


import java.sql.Date;

/**
 * @author Chen
 */

public class ExamInfoVO {

    private String examId;

    private String courseName;

    private String courseType;

    private Date examTime;

    private String examPlace;

    private String examSection;

    private String examInvigilator;

    private String examType;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    public String getExamPlace() {
        return examPlace;
    }

    public void setExamPlace(String examPlace) {
        this.examPlace = examPlace;
    }

    public String getExamSection() {
        return examSection;
    }

    public void setExamSection(Integer examSection) {
        switch (examSection) {
            case 1:
                this.examSection = "1-2节";
                break;
            case 2:
                this.examSection = "3-4节";
                break;
            case 3:
                this.examSection = "5-6节";
                break;
            case 4:
                this.examSection = "7-8节";
                break;
            case 5:
                this.examSection = "9-10节";
                break;
            case 6:
                this.examSection = "11-12节";
                break;
            case 7:
                this.examSection = "13-14节";
                break;
            default:
                this.examSection = "";
        }
    }

    public String getExamInvigilator() {
        return examInvigilator;
    }

    public void setExamInvigilator(String examInvigilator) {
        this.examInvigilator = examInvigilator;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    @Override
    public String toString() {
        return "ExamInfoVO{" +
                "examId='" + examId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", examTime=" + examTime +
                ", examPlace='" + examPlace + '\'' +
                ", examSection=" + examSection +
                ", examInvigilator='" + examInvigilator + '\'' +
                ", examType='" + examType + '\'' +
                '}';
    }
}
