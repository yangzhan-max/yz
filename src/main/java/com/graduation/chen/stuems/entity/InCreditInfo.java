package com.graduation.chen.stuems.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class InCreditInfo {

    private Integer inId;

    private String studentId;

    private String auditStatue;

    private String inCreditType;

    private String inCreditName;

    private String inCreditProve;

    private String inCreditReason;

    private BigDecimal inCreditScore;

    private Date requestTime;

    private Date auditTime;

    public Integer getInId() {
        return inId;
    }

    public void setInId(Integer inId) {
        this.inId = inId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getAuditStatue() {
        return auditStatue;
    }

    public void setAuditStatue(String auditStatue) {
        this.auditStatue = auditStatue == null ? null : auditStatue.trim();
    }

    public String getInCreditType() {
        return inCreditType;
    }

    public void setInCreditType(String inCreditType) {
        this.inCreditType = inCreditType == null ? null : inCreditType.trim();
    }

    public String getInCreditName() {
        return inCreditName;
    }

    public void setInCreditName(String inCreditName) {
        this.inCreditName = inCreditName == null ? null : inCreditName.trim();
    }

    public String getInCreditProve() {
        return inCreditProve;
    }

    public void setInCreditProve(String inCreditProve) {
        this.inCreditProve = inCreditProve == null ? null : inCreditProve.trim();
    }

    public String getInCreditReason() {
        return inCreditReason;
    }

    public void setInCreditReason(String inCreditReason) {
        this.inCreditReason = inCreditReason == null ? null : inCreditReason.trim();
    }

    public BigDecimal getInCreditScore() {
        return inCreditScore;
    }

    public void setInCreditScore(BigDecimal inCreditScore) {
        this.inCreditScore = inCreditScore;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}