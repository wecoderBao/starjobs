package com.starjobs.pojo;

import java.util.Date;

public class TUserRecharge {
    private Integer cUserRechargeId;

    private Integer cUserId;

    private Integer cUserRechargeMoney;

    private Date cUserRechargeDate;

    private Integer cUserBalanceAfter;

    public Integer getcUserRechargeId() {
        return cUserRechargeId;
    }

    public void setcUserRechargeId(Integer cUserRechargeId) {
        this.cUserRechargeId = cUserRechargeId;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    public Integer getcUserRechargeMoney() {
        return cUserRechargeMoney;
    }

    public void setcUserRechargeMoney(Integer cUserRechargeMoney) {
        this.cUserRechargeMoney = cUserRechargeMoney;
    }

    public Date getcUserRechargeDate() {
        return cUserRechargeDate;
    }

    public void setcUserRechargeDate(Date cUserRechargeDate) {
        this.cUserRechargeDate = cUserRechargeDate;
    }

    public Integer getcUserBalanceAfter() {
        return cUserBalanceAfter;
    }

    public void setcUserBalanceAfter(Integer cUserBalanceAfter) {
        this.cUserBalanceAfter = cUserBalanceAfter;
    }
}