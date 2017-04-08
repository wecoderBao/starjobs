package com.starjobs.pojo;

import java.util.Date;

public class TUserToken {
    private Integer cId;

    private String cTokenValue;

    private String cPhoneNum;

    private Date cCreateTime;

    private Date cTokenExpire;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcTokenValue() {
        return cTokenValue;
    }

    public void setcTokenValue(String cTokenValue) {
        this.cTokenValue = cTokenValue == null ? null : cTokenValue.trim();
    }

    public String getcPhoneNum() {
        return cPhoneNum;
    }

    public void setcPhoneNum(String cPhoneNum) {
        this.cPhoneNum = cPhoneNum == null ? null : cPhoneNum.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public Date getcTokenExpire() {
        return cTokenExpire;
    }

    public void setcTokenExpire(Date cTokenExpire) {
        this.cTokenExpire = cTokenExpire;
    }
}