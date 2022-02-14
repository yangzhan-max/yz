package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.service.CourseRelatedService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


/**
 * @author chen
 */
@RestController
@RequestMapping("/course")
public class ExamInfoController {

    @Resource
    private CourseRelatedService courseRelatedService;

    /**
     * @param session 服务端session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/course-exam", method = RequestMethod.GET)
    public ResponseData showAllExamInfoByStudentId(HttpSession session) {

        String studentId = (String) session.getAttribute("session_user");
        return ResponseDataUtil.requestSuccess(
                courseRelatedService.listAllByStudentIdInExamInfo(studentId));
    }
}
