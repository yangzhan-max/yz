package com.graduation.chen.stuems.model.vo;

import lombok.Data;

import java.sql.Date;

/**
 * @author Chen
 * @since  2020-2-28
 */
@Data
public class CourseInfoVO {
    //课程编号
    private String courseId;
    //课程名称
    private String courseName;
    //课程教师
    private String courseTeacher;
    //课程周期
    private String courseCycle;
    //课程类型
    private String courseType;
    //课程学分
    private Double courseCredit;
    // 课程开始时间
    private Date courseBegin;
    //课程所属系别
    private String courseBelong;
}
