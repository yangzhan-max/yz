package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.service.EvaluateService;
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
@RequestMapping("/evaluate")
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;


    @RequestMapping(value = "/show-ev", method = RequestMethod.GET)
    public ResponseData showSelectedCourse(HttpSession session) {

        //从session中获取用户名
        String studentId = (String) session.getAttribute("session_user");
        //再放入到查询对象中
        return ResponseDataUtil.validateSuccess(
                evaluateService.getByStudentIdInEvaluate(studentId));
    }

    @PostMapping(value = "/up-ev")
    public ResponseData updateEvaluate(
            @NotBlank(message = "分数不能为空！") @RequestParam("evaluateScore") Integer score,
            @NotBlank(message = "课程名称不能为空！") @RequestParam("courseName") String courseName,
            HttpSession session) {

        //从session中获取用户名
        String studentId = (String) session.getAttribute("session_user");

        return evaluateService.updateInEvaluate(score, studentId, courseName) == 1 ?
                ResponseDataUtil.validateSuccess("评教完成") :
                ResponseDataUtil.validateFail("评教失败");
    }

    @GetMapping(value = "/show-detail")
    public ResponseData showSelectCourseDetail(
            @NotBlank(message = "课程编号不能为空！") @RequestParam String courseId,
            HttpSession session) {
        //从session中获取用户名
        String studentId = (String) session.getAttribute("session_user");

        return ResponseDataUtil.requestSuccess(
                evaluateService.getCourseInfoInEvaluate(courseId, studentId));
    }
}
