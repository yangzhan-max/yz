package com.graduation.chen.stuems.service.impl;

import com.graduation.chen.stuems.dao.CourseInfoMapper;
import com.graduation.chen.stuems.dao.SelectCourseMapper;
import com.graduation.chen.stuems.model.dto.SelectCourseDTO;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.CourseScoreVO;
import com.graduation.chen.stuems.model.vo.CreditWarningVO;
import com.graduation.chen.stuems.service.InfoSearchingService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chen
 */
@Service("infoSearchingService")
public class InfoSearchingServiceImpl implements InfoSearchingService {
    @Resource
    private CourseInfoMapper courseInfoMapper;
    @Resource
    private SelectCourseMapper selectCourseMapper;


    /**
     * 根据学号查询学分信息
     */
    @Override
    public List<CreditWarningVO> listCreditInfoByStudentId(String studentId) {
        return courseInfoMapper.listCreditInfoByStudentId(studentId);
    }

    /**
     * 获取学生课程成绩
     */
    @Override
    public List<CourseScoreVO> listAllByQueryInAllCourseScore(SchoolTermQuery schoolTermQuery) {

        List<CourseScoreVO> voList = new ArrayList<>();

        List<SelectCourseDTO> dtoList = selectCourseMapper.listAllByQuery(schoolTermQuery);
        for (SelectCourseDTO selectCourseDTO : dtoList) {
            //创建返回给前端的课程相关vo对象
            CourseScoreVO courseScoreVO = new CourseScoreVO();
            //复制bean属性
            BeanUtils.copyProperties(selectCourseDTO, courseScoreVO);
            voList.add(courseScoreVO);
        }
        return voList;
    }
}
