package com.graduation.chen.stuems.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 学生课程相关DTO对象
 *
 * @author Chen
 */
@Setter
@Getter
@ToString
public class SelectCourseDTO {

    /**
     * 课程相关编号
     */
    private Integer id;
    /**
     * 学生学号
     */
    private String studentId;
    /**
     * 课程编号
     */
    private String courseId;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 课程地点
     */
    private String coursePlace;
    /**
     * 课程教师
     */
    private String courseTeacher;
    /**
     * 课程时间（星期）
     */
    private Integer courseWeek;
    /**
     * 课程节次
     */
    private Integer courseSection;
    /**
     * 课程周期
     */
    private String courseCycle;
    /**
     * 课程类型
     */
    private String courseType;
    /**
     * 课程学分
     */
    private Double courseCredit;
    /**
     * 学期
     */
    private Integer courseTerm;
    /**
     * 学年
     */
    private String courseYear;
    /**
     * 课程成绩
     */
    private Integer courseScore;
    /**
     * 课程补考成绩
     */
    private Integer courseScoreSecond;
    /**
     * 课程终极补考成绩
     */
    private Integer courseScoreFinal;
    /**
     * 课程所属系别
     */
    private String courseBelong;
}
