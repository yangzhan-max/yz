package com.graduation.chen.stuems.service;

import java.io.File;
import java.util.List;

/**
 * @author chen
 * @since 2020-02-28
 */
public interface EmailService {

    //简单邮箱服务
    void sendSimpleMail(String to, String title, String content);

    //附带文件邮箱服务
    void sendAttachmentsMail(String to, String title, String cotent, List<File> fileList);
}
