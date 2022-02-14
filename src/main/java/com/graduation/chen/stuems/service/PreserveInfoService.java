package com.graduation.chen.stuems.service;

import com.graduation.chen.stuems.model.query.InnovationCreditsInsert;
import com.graduation.chen.stuems.model.vo.InCreditInfoVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PreserveInfoService {

    //获取创新学分信息
    List<InCreditInfoVO> listAllByStudentInCredit(String studentId);

    //学分证明截图上传
    int uploadCreditPic(MultipartFile pic, InnovationCreditsInsert insert);

    //获取学分情况
    List getAllInCredit(String studentId);
}
