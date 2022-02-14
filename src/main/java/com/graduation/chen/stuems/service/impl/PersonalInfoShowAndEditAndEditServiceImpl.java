package com.graduation.chen.stuems.service.impl;

import com.graduation.chen.stuems.dao.BaseInfoMapper;
import com.graduation.chen.stuems.dao.ResidentInfoMapper;
import com.graduation.chen.stuems.dao.StudentInfoMapper;
import com.graduation.chen.stuems.entity.BaseInfo;
import com.graduation.chen.stuems.entity.ResidentInfo;
import com.graduation.chen.stuems.entity.StudentInfo;
import com.graduation.chen.stuems.model.vo.PersonalAllInfoVO;
import com.graduation.chen.stuems.service.PersonalInfoShowAndEditServiceI;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Chen
 * @since 2020-2-24
 */
@Service("PersonalInfoShowAndEditServiceI")
public class PersonalInfoShowAndEditAndEditServiceImpl implements PersonalInfoShowAndEditServiceI {

    @Resource
    private BaseInfoMapper baseInfoMapper;
    @Resource
    private ResidentInfoMapper residentInfoMapper;
    @Resource
    private StudentInfoMapper studentInfoMapper;


    /**
     * 所有信息展示
     */
    @Override
    public PersonalAllInfoVO getAllByStudentIdInAllInfo(String studentId) {

        //创建个人所有信息领域对象
        PersonalAllInfoVO personalAllInfoVO = new PersonalAllInfoVO();
        //基本、身份、学籍实体类对象
        BaseInfo baseInfo = baseInfoMapper.selectAllByStudentIdInBase(studentId);
        ResidentInfo residentInfo = residentInfoMapper.selectAllByStudentIdInResident(studentId);
        StudentInfo studentInfo = studentInfoMapper.selectAllByStudentIdInStudent(studentId);
        //复制到领域对象中
        BeanUtils.copyProperties(baseInfo, personalAllInfoVO);
        BeanUtils.copyProperties(residentInfo, personalAllInfoVO);
        BeanUtils.copyProperties(studentInfo, personalAllInfoVO);
        return personalAllInfoVO;
    }


}
