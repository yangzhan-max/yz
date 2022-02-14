package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.model.query.SchoolTermQuery;
import com.graduation.chen.stuems.service.CourseRelatedService;
import com.graduation.chen.stuems.service.PersonalInfoShowAndEditServiceI;
import com.graduation.chen.stuems.service.UserAccountService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;

/**
 * @author Chen
 */
@RestController
@RequestMapping("/view")
public class IndexInfoController {

    @Autowired
    private PersonalInfoShowAndEditServiceI infoShowAndEditService;
    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private CourseRelatedService courseRelatedService;

    /**
     * 修改邮箱需要先验证密码
     *
     * @param password 密码
     * @param session  服务器session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/pwd-check", method = RequestMethod.POST)
    public ResponseData validatePasswordByIdInModifyEmail(
            @NotBlank(message = "密码不能为空") @RequestParam("password") String password,
            HttpSession session) {

        String studentId = (String) session.getAttribute("session_user");
        //查询到密码
        String inQuirePassword = userAccountService.getPasswordByStudentId(studentId);
        //比对密码
        return inQuirePassword.equals(password) ?
                ResponseDataUtil.validateSuccess() : ResponseDataUtil.validateFail();
    }

    /**
     * 上传头像
     *
     * @param pic     SpingMVC文件流对象
     * @param session 服务端session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/upload-pic", method = RequestMethod.POST)
    public ResponseData uploadHeadPicByIdStudentId(
            @NotBlank(message = "未上传截图") @RequestParam("file") MultipartFile pic,
            HttpSession session) {

        String studentId = (String) session.getAttribute("session_user");
        return (userAccountService.uploadHeadPic(pic, studentId) == 1) ?
                ResponseDataUtil.requestSuccess("图片上传成功") :
                ResponseDataUtil.requestError("图片上传失败！");

    }

    /**
     * 显示个人所有信息
     *
     * @param session 服务器session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/show-all", method = RequestMethod.GET)
    public ResponseData showAllInfoByStudentId(HttpSession session) {

        //从session中取出用户名
        String studentId = (String) session.getAttribute("session_user");
        return ResponseDataUtil.requestSuccess(
                infoShowAndEditService.getAllByStudentIdInAllInfo(studentId));
    }


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
        return ResponseDataUtil.requestSuccess(
                courseRelatedService.listAllByQueryInAllSelectCourse(schoolTermQuery));
    }

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
        return ResponseDataUtil.requestSuccess(
                courseRelatedService.listAllByQueryInAllCourseScore(schoolTermQuery));
    }
}
