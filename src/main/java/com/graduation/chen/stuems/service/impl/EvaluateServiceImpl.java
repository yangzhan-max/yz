package com.graduation.chen.stuems.service.impl;

import com.graduation.chen.stuems.dao.SelectCourseMapper;
import com.graduation.chen.stuems.entity.SelectCourse;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.CourseInfoVO;
import com.graduation.chen.stuems.model.vo.EvaluateVO;
import com.graduation.chen.stuems.service.EvaluateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Chen
 */
@Service("evaluateService")
public class EvaluateServiceImpl implements EvaluateService {

    @Resource
    private SelectCourseMapper selectCourseMapper;


    @Override
    public List<String> getByStudentIdInEvaluate(String studentId) {
        return selectCourseMapper.getByIdInEvaluate(studentId);
    }

    @Override
    public int updateInEvaluate(Integer score, String studentId, String courseName) {
        return selectCourseMapper.updateInEvaluate(score, studentId, courseName);
    }

    @Override
    public Map<String,String> getCourseInfoInEvaluate(String courseId, String studentId) {
//
//        List list = selectCourseMapper.getCourseInEvaluate(courseId, studentId);
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("list:" + list.get(i).toString());
//        }
        return selectCourseMapper.getCourseInEvaluate(courseId, studentId);
    }
}
