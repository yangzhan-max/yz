package com.graduation.chen.stuems.service.impl;

import com.graduation.chen.stuems.dao.FinalExamInfoMapper;
import com.graduation.chen.stuems.dao.LevelExamInfoMapper;
import com.graduation.chen.stuems.dao.SecondExamInfoMapper;
import com.graduation.chen.stuems.dao.TeachProgramInfoMapper;
import com.graduation.chen.stuems.entity.LevelExamInfo;
import com.graduation.chen.stuems.entity.TeachProgramInfo;
import com.graduation.chen.stuems.model.dto.SecondExamDTO;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.FinalExamVO;
import com.graduation.chen.stuems.model.vo.LevelExamVO;
import com.graduation.chen.stuems.model.vo.SecondExamVO;
import com.graduation.chen.stuems.model.vo.TeachProgramInfoVO;
import com.graduation.chen.stuems.service.SignInfoShowService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("SignInfoShowService")
public class SignInfoShowServiceImpl implements SignInfoShowService {

    @Resource
    private LevelExamInfoMapper levelExamInfoMapper;

    //获取考级项目信息
    @Override
    public List<LevelExamVO> listAllByStudentIdInAllLevelExam(String studentId) {
        List<LevelExamVO> voList = new ArrayList<>();

        List<LevelExamInfo> list = levelExamInfoMapper.selectAllByStudentId(studentId);

        for (LevelExamInfo levelExamInfo : list) {
            //创建返回给前端的课程相关vo对象
            LevelExamVO levelExamVO = new LevelExamVO();
            //复制bean属性
            BeanUtils.copyProperties(levelExamInfo, levelExamVO);
            voList.add(levelExamVO);
        }
        return voList;
    }

    @Resource
    private SecondExamInfoMapper secondExamInfoMapper;

    //获取补考信息
    @Override
    public List<SecondExamVO> listAllByQueryInAllSecondExam(SchoolTermQuery schoolTermQuery) {
        List<SecondExamVO> voList = new ArrayList<>();

        List<SecondExamDTO> list = secondExamInfoMapper.listAllByQuery(schoolTermQuery);

        for (SecondExamDTO secondExamDTO : list) {
            //创建返回给前端的补考相关vo对象
            SecondExamVO secondExamVO = new SecondExamVO();
            //复制bean属性
            BeanUtils.copyProperties(secondExamDTO, secondExamVO);
            voList.add(secondExamVO);
        }
        return voList;
    }

    @Resource
    private FinalExamInfoMapper finalExamInfoMapper;

    //获取终极补考信息
    @Override
    public List<FinalExamVO> listAllByStudentIdInAllFinalExam(String studentId) {
        return finalExamInfoMapper.listAllBystudentId(studentId);
    }


    @Resource
    private TeachProgramInfoMapper teachProgramInfoMapper;

    //插入教学项目记录
    @Override
    public int insertInTeachProgram(TeachProgramInfo teachProgramInfo) {
        return teachProgramInfoMapper.insert(teachProgramInfo);
    }

    @Override
    public List<TeachProgramInfoVO> listAllInTeachProgram(String id) {
        return  teachProgramInfoMapper.selectByPrimaryKey(id);
    }
}
