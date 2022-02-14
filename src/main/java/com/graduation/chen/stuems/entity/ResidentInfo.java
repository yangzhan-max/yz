package com.graduation.chen.stuems.entity;

import java.sql.Date;

/**
 * 身份证信息
 */
public class ResidentInfo {
    //身份证号码
    private String residentId;
    //姓名
    private String name;
    //性别
    private String gender;
    //籍贯
    private String nativePlace;
    //出生日期
    private Date borthDate;
    //国籍
    private String nation;
    //名族
    private String minority;
    //政治面貌
    private String politicalFace;
    //证件类型
    private String residentType;

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId == null ? null : residentId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public Date getBorthDate() {
        return borthDate;
    }

    public void setBorthDate(Date borthDate) {
        this.borthDate = borthDate;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getMinority() {
        return minority;
    }

    public void setMinority(String minority) {
        this.minority = minority == null ? null : minority.trim();
    }

    public String getPoliticalFace() {
        return politicalFace;
    }

    public void setPoliticalFace(String politicalFace) {
        this.politicalFace = politicalFace == null ? null : politicalFace.trim();
    }

    public String getResidentType() {
        return residentType;
    }

    public void setResidentType(String residentType) {
        this.residentType = residentType == null ? null : residentType.trim();
    }

    @Override
    public String toString() {
        return "ResidentInfo{" +
                "residentId='" + residentId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", borthDate=" + borthDate +
                ", nation='" + nation + '\'' +
                ", minority='" + minority + '\'' +
                ", politicalFace='" + politicalFace + '\'' +
                ", residentType='" + residentType + '\'' +
                '}';
    }
}