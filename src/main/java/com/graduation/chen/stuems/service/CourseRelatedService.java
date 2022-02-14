package com.graduation.chen.stuems.service;

import com.graduation.chen.stuems.entity.CourseInfo;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.CourseInfoVO;
import com.graduation.chen.stuems.model.vo.CourseScoreVO;
import com.graduation.chen.stuems.model.vo.ExamInfoVO;
import com.graduation.chen.stuems.model.vo.SelectCourseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Chen
 * @since 2020-02-28
 */
public interface CourseRelatedService {
    //获取学生课表
    List<SelectCourseVO> listAllByQueryInAllSelectCourse(SchoolTermQuery schoolTermQuery);

    //获取学生课程成绩
    List<CourseScoreVO> listAllByQueryInAllCourseScore(SchoolTermQuery schoolTermQuery);

    //获取所有课程
    List<CourseInfoVO> listAllByBelongInCourseInfo(String courseBelong);

    //获取课程根据查询
    List<CourseInfoVO> listAllBySearch(String courseBelong, String courseName);

    //插入选课记录
    int insertInSelectCourse(SchoolTermQuery query);

    //查询当前选课的记录
    boolean getSelectCourseCurrent(SchoolTermQuery schoolTermQuery);

    //获取所有考试信息
    List<ExamInfoVO> listAllByStudentIdInExamInfo(String studentId);


}
