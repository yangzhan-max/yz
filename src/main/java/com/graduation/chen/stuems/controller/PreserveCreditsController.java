package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.model.query.InnovationCreditsInsert;
import com.graduation.chen.stuems.service.PreserveInfoService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author Chen
 */
@RestController
@RequestMapping("/preserve")
public class PreserveCreditsController {

    @Resource
    private PreserveInfoService preserveInfoService;

    /**
     * 获取所有创新创业学分信息
     *
     * @param session 服务器session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/show-inCredit", method = RequestMethod.GET)
    public ResponseData listAllInCreditInfo(HttpSession session) {

        String studentId = (String) session.getAttribute("session_user");

        return ResponseDataUtil.requestSuccess(preserveInfoService.listAllByStudentInCredit(studentId));
    }

    /**
     * 上传学分认证信息
     *
     * @param session 服务器session对象
     * @param request 服务器request对象
     * @param pic     springMVC文件流
     * @param insert  创新学分查询对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/upload-credit", method = RequestMethod.POST)
    public ResponseData uploadCreditInfo(
            HttpSession session, HttpServletRequest request,
            @NotBlank(message = "未上传截图") @RequestParam("file") MultipartFile pic,
            InnovationCreditsInsert insert) {

        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //获取二进制流中的request对象
        String studentId = (String) session.getAttribute("session_user");
        MultipartHttpServletRequest params = (MultipartHttpServletRequest) request;
        //添加到查询对象
        insert.setStudentId(studentId);
        insert.setType(params.getParameter("type"));
        insert.setName(params.getParameter("name"));
        insert.setReason(params.getParameter("reason"));
        insert.setRequestTime(new Date());

        return ResponseDataUtil.requestSuccess(preserveInfoService.uploadCreditPic(pic, insert));
    }


}
