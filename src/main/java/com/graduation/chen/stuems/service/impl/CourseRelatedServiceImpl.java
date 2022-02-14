package com.graduation.chen.stuems.service.impl;

import com.graduation.chen.stuems.dao.CourseInfoMapper;
import com.graduation.chen.stuems.dao.ExamInfoMapper;
import com.graduation.chen.stuems.dao.SelectCourseMapper;
import com.graduation.chen.stuems.entity.CourseInfo;
import com.graduation.chen.stuems.model.dto.SelectCourseDTO;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.CourseInfoVO;
import com.graduation.chen.stuems.model.vo.CourseScoreVO;
import com.graduation.chen.stuems.model.vo.ExamInfoVO;
import com.graduation.chen.stuems.model.vo.SelectCourseVO;
import com.graduation.chen.stuems.service.CourseRelatedService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chen
 * @since 2020-02-28
 */
@Service("courseRelatedService")
public class CourseRelatedServiceImpl implements CourseRelatedService {

    @Resource
    private SelectCourseMapper selectCourseMapper;
    @Resource
    private CourseInfoMapper courseInfoMapper;
    @Resource
    private ExamInfoMapper examInfoMapper;

    //获取学生课表
    @Override
    public List<SelectCourseVO> listAllByQueryInAllSelectCourse(SchoolTermQuery schoolTermQuery) {
        //创建返回给前端的课程相关vo对象集合
        List<SelectCourseVO> voList = new ArrayList<>();
        //接收从数据库查询到的课程相关dto对象集合
        List<SelectCourseDTO> dtoList = selectCourseMapper.listAllByQuery(schoolTermQuery);
        //循环集合
        for (SelectCourseDTO selectCourseDTO : dtoList) {
            //创建返回给前端的课程相关vo对象
            SelectCourseVO selectCourseVO = new SelectCourseVO();
            BeanUtils.copyProperties(selectCourseDTO, selectCourseVO);
            voList.add(selectCourseVO);
        }
        return voList;
    }

    //获取学生课程成绩
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

    //获取所有课程
    @Override
    public List<CourseInfoVO> listAllByBelongInCourseInfo(String courseBelong) {

        List<CourseInfoVO> voList = new ArrayList<>();

        List<CourseInfo> list = courseInfoMapper.listAllByCourseBelong(courseBelong);
        for (CourseInfo courseInfo : list) {
            //创建返回给前端的课程相关vo对象
            CourseInfoVO courseInfoVO = new CourseInfoVO();
            //复制bean属性
            BeanUtils.copyProperties(courseInfo, courseInfoVO);
            voList.add(courseInfoVO);
        }
        return voList;
    }

    //获取课程根据查询
    @Override
    public List<CourseInfoVO> listAllBySearch(String courseBelong, String courseName) {
        List<CourseInfoVO> voList = new ArrayList<>();

        String searchName = "%" + courseName + "%";
        List<CourseInfo> list = courseInfoMapper.listAllBySearch(courseBelong, searchName);
        for (CourseInfo courseInfo : list) {
            //创建返回给前端的课程相关vo对象
            CourseInfoVO courseInfoVO = new CourseInfoVO();
            //复制bean属性
            BeanUtils.copyProperties(courseInfo, courseInfoVO);
            voList.add(courseInfoVO);
        }
        return voList;
    }

    @Override
    public int insertInSelectCourse(SchoolTermQuery query) {
        return selectCourseMapper.insertInSelectCourse(query);
    }

    @Override
    public boolean getSelectCourseCurrent(SchoolTermQuery schoolTermQuery) {
        return selectCourseMapper.getSelectCourseCurrent(schoolTermQuery) == 1;
    }

    //获取考试信息安排
    @Override
    public List<ExamInfoVO> listAllByStudentIdInExamInfo(String studentId) {
        return examInfoMapper.listAllByStudentId(studentId);
    }
}
