package com.graduation.chen.stuems.service.impl;

import com.graduation.chen.stuems.dao.BaseInfoMapper;
import com.graduation.chen.stuems.service.UserAccountService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @author Chen
 * @since 2020-2-24
 */
@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {

    @Resource
    private BaseInfoMapper baseInfoMapper;

    //根据学号验证密码
    @Override
    public String getPasswordByStudentId(String studentId) {
        return baseInfoMapper.selectPasswordByStudentId(studentId);
    }

    //退出登录
    @Override
    public boolean exitLogin(HttpSession session) {

        String sessionAttribute = (String) session.getAttribute("session_user");
        if (sessionAttribute != null) {
            //注销session
            session.removeAttribute("session_user");
            return true;
        }
        return false;
    }


    //根据学号获取邮箱
    @Override
    public String getEmailByStudentId(String studentId) {
        return baseInfoMapper.selectEmailByStudentId(studentId);
    }


    //重新设置密码根据验证码
    @Override
    public String resetPasswordByCode(String studentId, String newPassword) {
        return baseInfoMapper.updatePassword(studentId, newPassword) == 1 ?
                "更改密码成功" : "更改密码出现异常";
    }


    //个人邮箱编辑(通过密码验证后)
    @Override
    public String resetEmailByStudentId(String newEmail, String studentId) {
        return baseInfoMapper.updateEmail(newEmail, studentId) == 1 ?
                "邮箱更改成功" : "邮箱更改异常";
    }

    //头像上传
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int uploadHeadPic(MultipartFile pic, String studentId) {
        // 获取图片原始文件名
        String originalFilename = pic.getOriginalFilename();
        // 获取上传图片的扩展名(jpg/png/...)
        String extension = FilenameUtils.getExtension(originalFilename);
        //图片名
        String currentFileName = "head_" + studentId + "." + extension;
        //当前项目路径
        String localPath = System.getProperty("user.dir");
        //图片上传的相对路径
        String headPath = "\\src\\main\\resources\\upload\\headpic\\" + currentFileName;
        //真实路径
        String realPath = localPath + headPath;
        //创建文件
        File file = new File(realPath);
        //判断文件是否存在
        if (!file.exists()) {
            //不存在则建立文件夹
            file.mkdirs();
        }
        try {
            //保存图片
            pic.transferTo(file);
            //最后执行数据库更新操作
            return baseInfoMapper.updatePicByStudentId(currentFileName, studentId);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
