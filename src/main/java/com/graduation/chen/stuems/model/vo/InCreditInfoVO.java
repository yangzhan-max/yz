package com.graduation.chen.stuems.model.vo;

import java.math.BigDecimal;
import java.sql.Date;

public class InCreditInfoVO {

    private String auditStatue;

    private String inCreditType;

    private String inCreditName;

    private String inCreditProve;

    private String inCreditReason;

    private BigDecimal inCreditScore;

    private Date requestTime;

    private Date auditTime;

    public String getAuditStatue() {
        return auditStatue;
    }

    public void setAuditStatue(String auditStatue) {
        this.auditStatue = auditStatue;
    }

    public String getInCreditType() {
        return inCreditType;
    }

    public void setInCreditType(String inCreditType) {
        this.inCreditType = inCreditType;
    }

    public String getInCreditName() {
        return inCreditName;
    }

    public void setInCreditName(String inCreditName) {
        this.inCreditName = inCreditName;
    }

    public String getInCreditProve() {
        return inCreditProve;
    }

    public void setInCreditProve(String inCreditProve) {
        this.inCreditProve = inCreditProve;
    }

    public String getInCreditReason() {
        return inCreditReason;
    }

    public void setInCreditReason(String inCreditReason) {
        this.inCreditReason = inCreditReason;
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
