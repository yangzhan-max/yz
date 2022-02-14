package com.graduation.chen.stuems.service;

import com.graduation.chen.stuems.entity.TeachProgramInfo;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.FinalExamVO;
import com.graduation.chen.stuems.model.vo.LevelExamVO;
import com.graduation.chen.stuems.model.vo.SecondExamVO;
import com.graduation.chen.stuems.model.vo.TeachProgramInfoVO;

import java.util.List;

public interface SignInfoShowService {

    //获取考级项目信息
    List<LevelExamVO> listAllByStudentIdInAllLevelExam(String studentId);

    //获取补考信息
    List<SecondExamVO> listAllByQueryInAllSecondExam(SchoolTermQuery schoolTermQuery);

    //获取终极补考信息
    List<FinalExamVO> listAllByStudentIdInAllFinalExam(String studentId);

    //插入教学项目记录
    int insertInTeachProgram(TeachProgramInfo teachProgramInfo);

    //获取教学项目信息
    List<TeachProgramInfoVO> listAllInTeachProgram(String id);
}
