package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.BaseInfo;


/**
 * @author Chen
 * @since 2020-03-04
 */
public interface BaseInfoMapper {

    //根据学号查询密码
    String selectPasswordByStudentId(String studentId);

    //根据学号查询密码和邮箱
    BaseInfo selectPasswordAndEmailByStudentId(String studentId);

    //根据学号查询邮箱
    String selectEmailByStudentId(String studentId);

    //根据学号查询所有基本信息
    BaseInfo selectAllByStudentIdInBase(String studentId);

    //更新密码
    int updatePassword(String studentId, String password);

    //更新邮箱
    int updateEmail(String newEmail, String studentId);

    //更新头像
    int updatePicByStudentId(String headPicPath, String studentId);
}