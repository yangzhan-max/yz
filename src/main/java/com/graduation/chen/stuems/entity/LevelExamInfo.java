package com.graduation.chen.stuems.entity;

import java.math.BigDecimal;

/**
 * 考级项目实体类
 */
public class LevelExamInfo {
    //编号
    private Integer id;
    //学号
    private String studentId;
    //身份证号
    private String residentId;
    //考级名称
    private String levelExamName;
    //考级分数
    private Integer levelExamScore;
    //报名费用
    private BigDecimal cost;
    //报名学年
    private String signYear;
    //报名学期
    private Integer signTerm;
    //是否缴费
    private byte isPaid;
    //报名状态
    private byte signState;
    //准考证号
    private String admissionNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId == null ? null : residentId.trim();
    }

    public String getLevelExamName() {
        return levelExamName;
    }

    public void setLevelExamName(String levelExamName) {
        this.levelExamName = levelExamName == null ? null : levelExamName.trim();
    }

    public Integer getLevelExamScore() {
        return levelExamScore;
    }

    public void setLevelExamScore(Integer levelExamScore) {
        this.levelExamScore = levelExamScore;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getSignYear() {
        return signYear;
    }

    public void setSignYear(String signYear) {
        this.signYear = signYear == null ? null : signYear.trim();
    }

    public Integer getSignTerm() {
        return signTerm;
    }

    public void setSignTerm(Integer signTerm) {
        this.signTerm = signTerm;
    }

    public byte getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(byte isPaid) {
        this.isPaid = isPaid;
    }

    public byte getSignState() {
        return signState;
    }

    public void setSignState(byte signState) {
        this.signState = signState;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber == null ? null : admissionNumber.trim();
    }

    @Override
    public String toString() {
        return "LevelExamInfo{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", residentId='" + residentId + '\'' +
                ", levelExamName='" + levelExamName + '\'' +
                ", levelExamScore=" + levelExamScore +
                ", cost=" + cost +
                ", signYear='" + signYear + '\'' +
                ", signTerm=" + signTerm +
                ", isPaid=" + isPaid +
                ", signState=" + signState +
                ", admissionNumber='" + admissionNumber + '\'' +
                '}';
    }
}