package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.service.CourseRelatedService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Chen
 */
@RestController
@RequestMapping("/course")
public class CourseScheduleController {


    @Autowired
    private CourseRelatedService courseRelatedService;

    /**
     * 显示该学生的当前课表
     *
     * @param schoolTermQuery 查询对象
     * @param session         服务端session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/show-course", method = RequestMethod.POST)
    public ResponseData showSelectCourseInfoByQuery(
            @RequestBody SchoolTermQuery schoolTermQuery, HttpSession session) {

        //从session中获取用户名
        String studentId = (String) session.getAttribute("session_user");
        //再放入到查询对象中
        schoolTermQuery.setStudentId(studentId);

        return ResponseDataUtil.requestSuccess(courseRelatedService.listAllByQueryInAllSelectCourse(schoolTermQuery));
    }


}
