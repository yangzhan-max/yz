package com.graduation.chen.stuems.service;

import com.graduation.chen.stuems.model.vo.PersonalAllInfoVO;


public interface PersonalInfoShowAndEditServiceI  {


    //显示个人所有信息
    PersonalAllInfoVO getAllByStudentIdInAllInfo(String studentId);



//    //个人基本信息展示
//    BaseInfoAllDTO getAllByStudentIdInBaseInfo(String studentId);

//    //身份基本信息展示
//    ResidentInfo getAllByStudentIdInResident(String studentId);
//
//    //学籍信息展示
//    StudentInfo getAllByStudentIdInStudent(String studentId);


}
