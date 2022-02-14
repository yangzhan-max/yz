package com.graduation.chen.stuems.dao;

import com.graduation.chen.stuems.entity.SelectCourse;
import com.graduation.chen.stuems.model.dto.SelectCourseDTO;
import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.model.vo.CourseInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Chen
 */
public interface SelectCourseMapper {

    /**
     * 显示所有课程相关信息
     *
     * @param query 查询对象（学号学期学年）
     * @return 对象集合（选课DTO）
     */
    List<SelectCourseDTO> listAllByQuery(@Param("schoolTermQuery") SchoolTermQuery query);

    /**
     * 查询网上评价相关信息
     */
    List<String> getByIdInEvaluate(String studentId);

    int updateInEvaluate(Integer score, String studentId, String courseName);

    Map<String, String> getCourseInEvaluate(@Param("courseId") String courseId,
                                            @Param("studentId") String studentId);

    int insertInSelectCourse(@Param("schoolTermQuery") SchoolTermQuery query);

    int getSelectCourseCurrent(@Param("schoolTermQuery") SchoolTermQuery query);
}