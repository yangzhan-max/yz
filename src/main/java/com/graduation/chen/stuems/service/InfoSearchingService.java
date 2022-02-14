package com.graduation.chen.stuems.service;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.CourseScoreVO;
import com.graduation.chen.stuems.model.vo.CreditWarningVO;

import java.util.List;

/**
 * @author Chen
 */
public interface InfoSearchingService {

    /**
     * 根据学号查询
     *
     * @param studentId 学号
     * @return 对象集合（学分信息VO）
     */
    List<CreditWarningVO> listCreditInfoByStudentId(String studentId);


    /**
     * 获取学生课程成绩
     *
     * @param schoolTermQuery 参数对象（学年学期学号）
     * @return 对象集合（课程成绩vo）
     */
    List<CourseScoreVO> listAllByQueryInAllCourseScore(SchoolTermQuery schoolTermQuery);
}
