package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.service.SignInfoShowService;
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
@RequestMapping("/view")
public class SecondExamInfoController {

    @Autowired
    private SignInfoShowService signInfoShowService;

    /**
     * 获取补考信息
     *
     * @param session 服务端session对象
     * @param schoolTermQuery   查询对象
     * @return ResponseData 统一返回数据格式
     */
    @RequestMapping(value = "/show-second-exam", method = RequestMethod.POST)
    public ResponseData showSecondExamInfoByStudentId(
            HttpSession session, @RequestBody SchoolTermQuery schoolTermQuery) {

        //从session中获取用户名
        String studentId = (String) session.getAttribute("session_user");
        schoolTermQuery.setStudentId(studentId);
        return ResponseDataUtil.requestSuccess(
                signInfoShowService.listAllByQueryInAllSecondExam(schoolTermQuery));
    }
}
