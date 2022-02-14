package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.service.CourseRelatedService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;

/**
 * @author Chen
 */
@RestController
@RequestMapping("/course")
public class CourseChooseController {

    @Autowired
    private CourseRelatedService courseRelatedService;

    /**
     * 查询该学生可选课程
     *
     * @param courseBelong 课程所属系别
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/course-choose", method = RequestMethod.GET)
    public ResponseData showAllCourseInfoByBelong(
            @NotBlank(message = "所属系别不能为空") @RequestParam("courseBelong")
                    String courseBelong) {

        return ResponseDataUtil.requestSuccess(
                courseRelatedService.listAllByBelongInCourseInfo(courseBelong));
    }

    @RequestMapping(value = "/course-search", method = RequestMethod.GET)
    public ResponseData showAllCourseInfoBySearch(
            @NotBlank(message = "所属系别不能为空") @RequestParam("courseBelong")
                    String courseBelong,
            @NotBlank(message = "课程名不能为空") @RequestParam("search")
                    String courseName) {

        return ResponseDataUtil.requestSuccess(
                courseRelatedService.listAllBySearch(courseBelong, courseName));
    }

    @RequestMapping(value = "/course-select", method = RequestMethod.POST)
    public ResponseData insertInSelectCourse(
            @RequestBody SchoolTermQuery schoolTermQuery,
            HttpSession session) {

        String studentId = (String) session.getAttribute("session_user");
        schoolTermQuery.setStudentId(studentId);

        if (courseRelatedService.getSelectCourseCurrent(schoolTermQuery)) {
            return ResponseDataUtil.requestError("该课已经选择过了");
        }

        return ResponseDataUtil.requestSuccess(
                courseRelatedService.insertInSelectCourse(schoolTermQuery) == 1 ?
                        "添加记录成功" : "添加记录失败");
    }
}
