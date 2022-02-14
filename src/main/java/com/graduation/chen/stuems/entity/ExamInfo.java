package com.graduation.chen.stuems.entity;

import lombok.Data;

import java.sql.Date;

/**
 * 考试信息
 *
 * @author Chen
 * @since 2020-02-28
 */
@Data
public class ExamInfo {
    //考试编号
    private String examId;
    //学生编号
    private String studentId;
    //课程编号
    private String courseId;
    //考试日期
    private Date examTime;
    //考试地点
    private String examPlace;
    //考试节次
    private Integer examSection;
    //考试监考员
    private String examInvigilator;
    //考试类型
    private String examType;
}