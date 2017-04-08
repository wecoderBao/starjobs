package com.starjobs.pojo;

import java.util.Date;

public class TUserWithdraw {
    private Integer cUserWithdrawId;

    private Integer cUserId;

    private Integer cUserWithdrawMoney;

    private Date cUserWithdrawDate;

    private Integer cUserWithdrawAfter;

    public Integer getcUserWithdrawId() {
        return cUserWithdrawId;
    }

    public void setcUserWithdrawId(Integer cUserWithdrawId) {
        this.cUserWithdrawId = cUserWithdrawId;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    public Integer getcUserWithdrawMoney() {
        return cUserWithdrawMoney;
    }

    public void setcUserWithdrawMoney(Integer cUserWithdrawMoney) {
        this.cUserWithdrawMoney = cUserWithdrawMoney;
    }

    public Date getcUserWithdrawDate() {
        return cUserWithdrawDate;
    }

    public void setcUserWithdrawDate(Date cUserWithdrawDate) {
        this.cUserWithdrawDate = cUserWithdrawDate;
    }

    public Integer getcUserWithdrawAfter() {
        return cUserWithdrawAfter;
    }

    public void setcUserWithdrawAfter(Integer cUserWithdrawAfter) {
        this.cUserWithdrawAfter = cUserWithdrawAfter;
    }
}