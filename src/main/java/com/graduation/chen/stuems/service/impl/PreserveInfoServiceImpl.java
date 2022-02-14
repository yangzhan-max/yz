package com.graduation.chen.stuems.service.impl;

import com.graduation.chen.stuems.dao.InCreditInfoMapper;
import com.graduation.chen.stuems.entity.InCreditInfo;
import com.graduation.chen.stuems.model.query.InnovationCreditsInsert;
import com.graduation.chen.stuems.model.vo.InCreditInfoVO;
import com.graduation.chen.stuems.service.PreserveInfoService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("preserveInfoService")
public class PreserveInfoServiceImpl implements PreserveInfoService {


    @Resource
    private InCreditInfoMapper inCreditInfoMapper;

    //获取创新学分信息
    @Override
    public List<InCreditInfoVO> listAllByStudentInCredit(String studentId) {

        List<InCreditInfo> inCreditInfoList = inCreditInfoMapper.listByStudentIdInCredit(studentId);

        List<InCreditInfoVO> voList = new ArrayList<InCreditInfoVO>();

        for (InCreditInfo inCreditInfo : inCreditInfoList) {

            InCreditInfoVO inCreditInfoVO = new InCreditInfoVO();
            BeanUtils.copyProperties(inCreditInfo, inCreditInfoVO);
            voList.add(inCreditInfoVO);
        }
        return voList;
    }

    //学分证明截图上传
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int uploadCreditPic(MultipartFile pic, InnovationCreditsInsert insert) {

        // 获取图片原始文件名
        String originalFilename = pic.getOriginalFilename();
        // 获取上传图片的扩展名(jpg/png/...)
        String extension = FilenameUtils.getExtension(originalFilename);
        //图片当前名
        String currentTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String currentFileName = "credit_" + currentTime + insert.getStudentId() + "." + extension;
        // 图片上传的相对路径
        String path = "\\src\\main\\resources\\upload\\creditpic\\" + currentFileName;
        // 项目所在路径
        String localPath;
        //当前项目路径
        localPath = System.getProperty("user.dir");
        //图片上传的绝对路径
        String realPath = localPath + path;
        //创建文件
        File file = new File(realPath);
        //判断文件是否存在
        if (!file.exists()) {
            file.mkdirs();
        }
        // 上传图片
        try {
            pic.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //把文件名放入bean
        insert.setFileName(currentFileName);
        return inCreditInfoMapper.insertSelectiveInCredit(insert);
    }

    @Override
    public List getAllInCredit(String studentId) {
        return inCreditInfoMapper.getAllInCredit(studentId);
    }
}
