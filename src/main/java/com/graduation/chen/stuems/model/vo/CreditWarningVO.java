package com.graduation.chen.stuems.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chen
 */
@Setter
@Getter
@ToString
public class CreditWarningVO {

    /**
     * 课程编号
     */
    private String courseId;
    /**
     * 课程名称
     */
    private String courseName;
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
}
