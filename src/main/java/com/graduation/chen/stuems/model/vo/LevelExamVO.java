package com.graduation.chen.stuems.model.vo;

import java.math.BigDecimal;

/**
 * 考级项目信息VO对象
 */
public class LevelExamVO {

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
    private String isPaid;
    //报名状态
    private String signState;
    //准考证号
    private String admissionNumber;


    public String getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(byte isPaid) {

        this.isPaid = (isPaid == (byte) 0) ? "未缴费" : "已缴费";
    }

    public String getSignState() {
        return signState;
    }

    public void setSignState(byte signState) {
        this.signState = (signState == (byte) 0) ? "未通过" : "已通过";
    }

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
        this.studentId = studentId;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getLevelExamName() {
        return levelExamName;
    }

    public void setLevelExamName(String levelExamName) {
        this.levelExamName = levelExamName;
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
        this.signYear = signYear;
    }

    public Integer getSignTerm() {
        return signTerm;
    }

    public void setSignTerm(Integer signTerm) {
        this.signTerm = signTerm;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    @Override
    public String toString() {
        return "levelExamVO{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", residentId='" + residentId + '\'' +
                ", levelExamName='" + levelExamName + '\'' +
                ", levelExamScore=" + levelExamScore +
                ", cost=" + cost +
                ", signYear='" + signYear + '\'' +
                ", signTerm=" + signTerm +
                ", isPaid='" + isPaid + '\'' +
                ", signState='" + signState + '\'' +
                ", admissionNumber='" + admissionNumber + '\'' +
                '}';
    }
}
