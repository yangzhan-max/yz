package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.model.vo.ExamInfoVO;

import java.util.List;

/**
 * @author Chen
 */
public interface ExamInfoMapper {

    /**
     * 根据学号查询所有的考试信息
     *
     * @param studentId 学号
     * @return 对象集合（考试信息）
     */
    List<ExamInfoVO> listAllByStudentId(String studentId);
}