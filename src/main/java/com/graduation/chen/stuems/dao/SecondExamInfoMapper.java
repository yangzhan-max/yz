package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.SecondExamInfo;
import com.graduation.chen.stuems.model.dto.SecondExamDTO;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecondExamInfoMapper {

    //
    List<SecondExamDTO> listAllByQuery(@Param("schoolTermQuery") SchoolTermQuery query);


    int deleteByPrimaryKey(Integer id);

    int insert(SecondExamInfo record);

    int insertSelective(SecondExamInfo record);

    SecondExamInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecondExamInfo record);

    int updateByPrimaryKey(SecondExamInfo record);
}