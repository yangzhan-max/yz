package com.graduation.chen.stuems.service;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.CourseInfoVO;
import com.graduation.chen.stuems.model.vo.EvaluateVO;
import com.graduation.chen.stuems.model.vo.SelectCourseVO;

import java.util.List;
import java.util.Map;

/**
 * @author Chen
 */
public interface EvaluateService {


    List<String> getByStudentIdInEvaluate(String studentId);

    int updateInEvaluate(Integer score, String studentId, String courseName);

    Map<String,String> getCourseInfoInEvaluate(String courseId, String studentId);
}
