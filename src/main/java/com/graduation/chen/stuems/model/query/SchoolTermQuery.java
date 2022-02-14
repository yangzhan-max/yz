package com.graduation.chen.stuems.model.query;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 课程相关查询对象
 *
 * @author chen
 * @since 2020-02-28
 */
@Data
public class SchoolTermQuery {
    //学生编号
    @NotBlank(message = "学号不能为空")
    private String studentId;
    //课程编号
    @NotBlank(message = "课程号不能为空")
    private String courseId;
    //学期
    @NotNull(message = "学期不能为空")
    @Min(1)
    @Max(2)
    private Integer courseTerm;
    //学年
    @NotBlank(message = "学年不能为空")
    private String courseYear;
}
