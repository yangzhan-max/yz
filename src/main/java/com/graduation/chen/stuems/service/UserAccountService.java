package com.graduation.chen.stuems.service;

import com.graduation.chen.stuems.model.query.InnovationCreditsInsert;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

/**
 * @author Chen
 * @since 2020-2-24
 */
public interface UserAccountService {


    //根据学号获取密码
    String getPasswordByStudentId(String studentId);

    //退出登录
    boolean exitLogin(HttpSession session);

    //根据学号获取邮箱
    String getEmailByStudentId(String studentId);

    //根据验证码更新密码
    String resetPasswordByCode(String studentId, String newPassword);

    //个人邮箱编辑
    String resetEmailByStudentId(String newEmail, String studentId);

    //头像上传
    int uploadHeadPic(MultipartFile pic, String studentId);
}
