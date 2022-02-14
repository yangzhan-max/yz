package com.graduation.chen.stuems.controller;

import com.graduation.chen.stuems.entity.BaseInfo;
import com.graduation.chen.stuems.service.UserAccountService;
import com.graduation.chen.stuems.utils.resultUtil.ResponseData;
import com.graduation.chen.stuems.utils.resultUtil.ResponseDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;


/**
 * @author Chen
 * @since 2020-2-24
 */
@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserAccountService userAccountService;


    /**
     * 根据学号验证密码
     *
     * @param username 学号
     * @param password 密码
     * @param session  服务端Session对象
     * @return ResponseData 统一数据返回格式
     */
    @RequestMapping(value = "/login-check", method = RequestMethod.POST)
    public ResponseData validatePasswordById(
            @NotBlank(message = "用户名不能为空") @RequestParam("username") String username,
            @NotBlank(message = "密码不能为空") @RequestParam("password") String password,
            HttpSession session) {

        //判断是否有这个账号
        String inQuirePassword = userAccountService.getPasswordByStudentId(username);
        if (StringUtils.isEmpty(inQuirePassword)) {
            //如果为空则说明账号不存在
            //自定义result，这里状态码不能和其他状态码重复
            return ResponseDataUtil.buildState("203", "用户不存在");
        }
        //比对密码
        if (!inQuirePassword.equals(password)) {
            //密码错误
            return ResponseDataUtil.validateFail();
        }
        //放入session
        session.setAttribute("session_user", username);
        session.setMaxInactiveInterval(60 * 30);
        return ResponseDataUtil.validateSuccess();
    }

    /**
     * 退出账号
     *
     * @return ResponseData 统一数据返回格式
     * @Param session 服务器session对象
     */
    @RequestMapping(value = "/login-exit", method = RequestMethod.GET)
    public ResponseData LoginExit(HttpSession session) {

        return userAccountService.exitLogin(session) ?
                ResponseDataUtil.requestSuccess("成功退出登录！") :
                ResponseDataUtil.requestError("你还尚未登录！");
    }
}
