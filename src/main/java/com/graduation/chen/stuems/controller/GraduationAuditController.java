package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.service.PreserveInfoService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Chen
 * @version 1.0
 * @date 2020/4/25 0025 上午 8:35
 */
@RestController
@RequestMapping("/info")
public class GraduationAuditController {

    @Autowired
    private PreserveInfoService preserveInfoService;

    @RequestMapping(value = "/show-inCredit", method = RequestMethod.GET)
    public ResponseData showAllInfoByStudentId(HttpSession session) {

        //从session中取出用户名
        String studentId = (String) session.getAttribute("session_user");
        return ResponseDataUtil.requestSuccess(
                preserveInfoService.getAllInCredit(studentId));
    }


}
