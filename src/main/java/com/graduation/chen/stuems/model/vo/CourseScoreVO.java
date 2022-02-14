package com.graduation.chen.stuems.model.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 学生课程成绩VO对象
 * @author Chen
 */
@Setter
@Getter
@Data
public class CourseScoreVO {

    /**
     * 课程编号
     */
    private String courseId;
    /**
     * 课程名称
     */
    private String courseName;
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
     * 课程类型
     */
    private String courseType;
    /**
     * 课程学分
     */
    private Double courseCredit;
    /**
     * 课程所属系别
     */
    private String courseBelong;

}
