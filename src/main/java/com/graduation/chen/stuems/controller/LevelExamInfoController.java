package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.service.SignInfoShowService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Chen
 */
@RestController
@RequestMapping("/view")
public class LevelExamInfoController {

    @Autowired
    private SignInfoShowService signInfoShowService;

    /**
     * 获取等级考试信息
     *
     * @param session 服务端session对象
     * @return ResponseData 统一返回数据格式
     */
    @RequestMapping(value = "/show-level-exam", method = RequestMethod.GET)
    public ResponseData showSelectLevelExamInfoByStudentId(HttpSession session) {

        //从session中获取用户名
        String studentId = (String) session.getAttribute("session_user");

        return ResponseDataUtil.requestSuccess(signInfoShowService.listAllByStudentIdInAllLevelExam(studentId));
    }
}
