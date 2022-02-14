package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.CourseInfo;
import com.graduation.chen.stuems.model.vo.CreditWarningVO;

import java.util.List;

/**
 * @author Chen
 */
public interface CourseInfoMapper {

    /**
     * 根据课程所属系别获取课程列表
     *
     * @param courseBelong 课程所属系别
     * @return 对象集合（课程信息）
     */
    List<CourseInfo> listAllByCourseBelong(String courseBelong);

    /**
     * 根据学号获取所修学分相关信息
     *
     * @param studentId 学号
     * @return 对象集合（学分信息）
     */
    List<CreditWarningVO> listCreditInfoByStudentId(String studentId);

    List<CourseInfo> listAllBySearch(String courseBelong, String courseName);
}