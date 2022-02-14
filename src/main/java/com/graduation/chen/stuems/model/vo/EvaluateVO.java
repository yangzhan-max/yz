package com.graduation.chen.stuems.model.vo;

import lombok.Data;

/**
 * @author Chen
 */
@Data
public class EvaluateVO {
    //课程相关编号
    private Integer id;
    //学生学号
    private String studentId;
    //课程编号
    private String courseId;
    // 学期
    private Integer courseTerm;
    //学年
    private String courseYear;
    //是否已网上评价
    private Byte isEvaluate;
    //评价分数
    private Integer evaluateScore;
}
