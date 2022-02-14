package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.FinalExamInfo;
import com.graduation.chen.stuems.model.vo.FinalExamVO;

import java.util.List;

public interface FinalExamInfoMapper {

    //获取终极补考信息
    List<FinalExamVO> listAllBystudentId(String studentId);

    int deleteByPrimaryKey(Integer id);

    int insert(FinalExamInfo record);

    int insertSelective(FinalExamInfo record);

    FinalExamInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinalExamInfo record);

    int updateByPrimaryKey(FinalExamInfo record);
}