package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.service.InfoSearchingService;
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
@RequestMapping("/search")
public class CourseScoreShowController {

    @Autowired
    private InfoSearchingService infoSearchingService;

    /**
     * 显示该学生上学期分数
     *
     * @param schoolTermQuery 查询对象
     * @param session         服务端session对象
     * @return ResponseData 统一返回数据格式
     */
    @RequestMapping(value = "/show-score", method = RequestMethod.POST)
    public ResponseData showCourseScoreInfoByQuery(
            @RequestBody SchoolTermQuery schoolTermQuery, HttpSession session) {

        //从session中获取用户名
        String studentId = (String) session.getAttribute("session_user");
        //再放入到查询对象中
        schoolTermQuery.setStudentId(studentId);

        return ResponseDataUtil.requestSuccess(infoSearchingService.listAllByQueryInAllCourseScore(schoolTermQuery));
    }
}
