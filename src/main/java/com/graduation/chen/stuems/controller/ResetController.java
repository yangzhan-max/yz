package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.service.EmailService;
import com.graduation.chen.stuems.service.UserAccountService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Random;


/**
 * @author Chen
 * @since 2020-02-28
 */
@RestController
@RequestMapping("/reset")
public class ResetController {

    @Autowired
    private UserAccountService userAccountService;
    @Autowired
    private EmailService emailService;

    /**
     * 验证邮箱和学号是否存在
     *
     * @param studentId 学号
     * @param email     邮箱
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/vl-email", method = RequestMethod.GET)
    public ResponseData validateEmailById(
            @NotBlank(message = "用户名不能为空") @RequestParam("username") String studentId,
            @NotBlank(message = "邮箱不能为空") @Email(message = "不符合邮箱地址格式")
            @RequestParam("email") String email,
            HttpSession session) {

        //判断是否有该学号
        if (StringUtils.isEmpty(userAccountService.getEmailByStudentId(studentId))) {
            return ResponseDataUtil.buildState("203", "用户不存在");
        }
        //判断邮箱是否正确且返回正确结果
        if (!email.equals(userAccountService.getEmailByStudentId(studentId))) {
            return ResponseDataUtil.validateFail("邮箱不正确！");
        }
        //随机确6位数的验证码
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        //发送内容
        String message = "您的重置验证码为：" + checkCode + "，有效期10分钟，如非本人操作，请忽略本邮件。";
        try {
            emailService.sendSimpleMail(email, "密码重置", message);
            //将验证码放入session中
            session.setAttribute("checkCode", checkCode);
            //设置session失效时间为10分钟
            session.setMaxInactiveInterval(600);
            //返回请求结果
            return ResponseDataUtil.validateSuccess();
        } catch (Exception e) {
            return ResponseDataUtil.requestError();
        }
    }


    /**
     * 先比对验证码，然后更新密码
     *
     * @param studentId   学号
     * @param checkCode   验证码
     * @param newPassword 新密码
     * @param session     服务器session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/up-pwd", method = RequestMethod.POST)
    public ResponseData updatePasswordByCheckCode(
            @NotBlank(message = "用户名不能为空") @RequestParam("username") String studentId,
            @NotBlank(message = "验证码不能为空") @Size(min = 6, max = 6, message = "非法的验证码")
            @RequestParam("checkCode") String checkCode,
            @NotBlank(message = "新密码不能为空") @RequestParam("newPassword") String newPassword,
            HttpSession session) {

        //取出session里的验证码
        String inSessionCheckCode = (String) session.getAttribute("checkCode");
        //比对验证码
        if (!checkCode.equals(inSessionCheckCode)) {
            ResponseDataUtil.validateFail("验证码错误");

        }
        //注销session
        userAccountService.exitLogin(session);
        return ResponseDataUtil.validateSuccess(userAccountService.
                resetPasswordByCode(studentId, newPassword));
    }

    /**
     * 验证新邮箱是否可用，即发送验证码到目标邮箱中
     *
     * @param newEmail 新邮箱地址
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/vl-newEmail", method = RequestMethod.GET)
    public ResponseData sendCodeAfterValidatePasswordSuccess(
            @NotBlank(message = "邮箱地址不能为空") @Email(message = "不符合邮箱地址格式")
            @RequestParam("newEmail") String newEmail,
            HttpSession session) {

        //先判断邮箱是否可用,给目标邮箱发送一条验证码
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "邮箱验证码为：" + checkCode + "，有效期10分钟，如非本人操作，请忽略本邮件。";
        try {
            emailService.sendSimpleMail(newEmail, "邮箱验证", message);
            //将验证码放入session中
            session.setAttribute("checkCode", checkCode);
            //设置session失效时间为10分钟
            session.setMaxInactiveInterval(600);
            //返回请求结果
            return ResponseDataUtil.requestSuccess();
        } catch (Exception e) {
            return ResponseDataUtil.requestError();
        }
    }

    /**
     * 比对验证码，成功则更改邮箱
     *
     * @param checkCode 邮箱验证码
     * @param newEmail  新邮箱
     * @param session   服务器session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/up-email", method = RequestMethod.GET)
    public ResponseData updateEmailAfterCodeValidateSuccess(
            @NotBlank(message = "验证码不能为空") @Size(min = 6, max = 6, message = "非法的验证码")
            @RequestParam("checkCode") String checkCode,
            @NotBlank(message = "邮箱地址不能为空") @Email(message = "不符合邮箱地址格式")
            @RequestParam("newEmail") String newEmail,
            HttpSession session) {

        //从session拿到用户名
        String studentId = (String) session.getAttribute("session_user");
        //从session中拿到正确的邮箱验证码
        String emailCheckCodeInSession = (String) session.getAttribute("checkCode");
        //比对验证码并返回给前端
        return checkCode.equals(emailCheckCodeInSession) ?
                ResponseDataUtil.validateSuccess(userAccountService.resetEmailByStudentId(newEmail, studentId)) :
                ResponseDataUtil.validateFail("验证码错误");
    }

    /**
     * 单独比较验证码
     *
     * @param checkCode 验证码
     * @param session   服务端session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/vl-code", method = RequestMethod.GET)
    public ResponseData ValidateCheckCode(
            @NotBlank(message = "验证码不能为空") @Size(min = 6, max = 6, message = "非法的验证码")
            @RequestParam("checkCode") String checkCode,
            HttpSession session) {

        //从session中拿到正确的验证码
        String checkCodeInSession = (String) session.getAttribute("checkCode");
        //比对验证码并返回给前端
        return checkCode.equals(checkCodeInSession) ?
                ResponseDataUtil.validateSuccess("比对成功") :
                ResponseDataUtil.validateFail("验证码错误");
    }
}
