package com.graduation.chen.stuems.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户基本信息
 *
 * @author Chen
 * @since 2020-02-28
 */
@Setter
@Getter
@ToString
public class BaseInfo {
    //学号
    private String studentId;
    //身份编号
    private String residentId;
    //密码
    private String password;
    //头像
    private String headPic;
    //邮箱
    private String email;
    //电话
    private String phone;
}