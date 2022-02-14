package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.LevelExamInfo;

import java.util.List;

public interface LevelExamInfoMapper {

    //根据学号查找考级信息
    List<LevelExamInfo> selectAllByStudentId(String studentId);

    int deleteByPrimaryKey(Integer id);

    int insert(LevelExamInfo record);

    int insertSelective(LevelExamInfo record);

    LevelExamInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LevelExamInfo record);

    int updateByPrimaryKey(LevelExamInfo record);
}