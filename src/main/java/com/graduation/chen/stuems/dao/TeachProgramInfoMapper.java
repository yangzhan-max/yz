package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.TeachProgramInfo;
import com.graduation.chen.stuems.model.vo.TeachProgramInfoVO;

import java.util.List;

public interface TeachProgramInfoMapper {
    int deleteByPrimaryKey(Integer id);

    //插入一条记录
    int insert(TeachProgramInfo record);

    int insertSelective(TeachProgramInfo record);

    //查询一条记录
    List<TeachProgramInfoVO> selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TeachProgramInfo record);

    int updateByPrimaryKey(TeachProgramInfo record);
}