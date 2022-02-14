package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.service.InfoSearchingService;
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
@RequestMapping("/search")
public class CreditWarningController {

    @Autowired
    private InfoSearchingService infoSearchingService;

    /**
     * @param session 服务端session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/credit", method = RequestMethod.GET)
    public ResponseData showCreditInfoByStudentId(HttpSession session) {

        String studentId = (String) session.getAttribute("session_user");
        return ResponseDataUtil.requestSuccess(
                infoSearchingService.listCreditInfoByStudentId(studentId));
    }
}
