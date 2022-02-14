package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.StudentInfo;


/**
 * @author Chen
 * @since 2020/2/24
 */
public interface StudentInfoMapper {

    /**
     * 根据学号查询学籍信息
     *
     * @param studentId 学号
     * @return 对象（学籍）
     */
    StudentInfo selectAllByStudentIdInStudent(String studentId);
}