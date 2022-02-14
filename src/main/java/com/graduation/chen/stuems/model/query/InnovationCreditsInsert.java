package com.graduation.chen.stuems.model.query;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class InnovationCreditsInsert {
    //学生学号
    @NotBlank(message = "学号不能为空")
    private String studentId;
    //学分类型
    @NotBlank(message = "学分类型不能为空")
    private String type;
    //项目名称
    @NotBlank(message = "认证项目名称不能为空")
    private String name;
    //认证截图
    @NotBlank(message = "文件名不能为空")
    private String fileName;
    //认证理由
    @NotBlank(message = "认证理由不能为空")
    private String reason;
    //认证日期
    @NotNull(message = "认证日期不能为空")
    private Date requestTime;
}


