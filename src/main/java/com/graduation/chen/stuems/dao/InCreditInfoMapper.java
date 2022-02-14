package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.InCreditInfo;
import com.graduation.chen.stuems.model.query.InnovationCreditsInsert;

import java.util.List;

public interface InCreditInfoMapper {

    //添加新的创新学分记录
    int insertSelectiveInCredit(InnovationCreditsInsert insert);

    //查询创新学分记录
    List<InCreditInfo> listByStudentIdInCredit(String studentId);

    //获取学分情况
    List getAllInCredit(String studentId);

    int deleteByPrimaryKey(Integer inId);

    int insert(InCreditInfo record);

    InCreditInfo selectByPrimaryKey(Integer inId);

    int updateByPrimaryKeySelective(InCreditInfo record);

    int updateByPrimaryKey(InCreditInfo record);
}