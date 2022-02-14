package com.graduation.chen.stuems.dao;


import com.graduation.chen.stuems.entity.ResidentInfo;

/**
 * @author chen
 * @since 2020/2/24
 */
public interface ResidentInfoMapper {

    /**
     * 根据学号查询个人身份信息
     *
     * @param studentId 学号
     * @return 对象（身份信息）
     */
    ResidentInfo selectAllByStudentIdInResident(String studentId);
}