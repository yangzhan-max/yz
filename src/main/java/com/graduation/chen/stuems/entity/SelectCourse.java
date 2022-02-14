package com.graduation.chen.stuems.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 课程相关表实体类
 *
 * @author Chen
 */
@Setter
@Getter
@ToString
public class SelectCourse {

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
     * 学期
     */
    private Integer courseTerm;
    /**
     * 学年
     */
    private String courseYear;
    /**
     * 考试分数
     */
    private Integer courseScore;
    /**
     * 补考分数
     */
    private Integer courseScoreSecond;
    /**
     * 终极补考分数
     */
    private Integer courseScoreFinal;

    /**
     * 是否已网上评价
     */
    private Byte isEvaluate;
    /**
     * 评价分数
     */
    private Integer evaluateScore;

}