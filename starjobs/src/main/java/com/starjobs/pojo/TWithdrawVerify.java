package com.starjobs.pojo;

public class TWithdrawVerify {
    private Integer cVerifyId;

    private Integer cUserId;

    private Integer cWithdrawMoney;

    private String cUserAliAccount;

    private String cVerifyState;

    public Integer getcVerifyId() {
        return cVerifyId;
    }

    public void setcVerifyId(Integer cVerifyId) {
        this.cVerifyId = cVerifyId;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    public Integer getcWithdrawMoney() {
        return cWithdrawMoney;
    }

    public void setcWithdrawMoney(Integer cWithdrawMoney) {
        this.cWithdrawMoney = cWithdrawMoney;
    }

    public String getcUserAliAccount() {
        return cUserAliAccount;
    }

    public void setcUserAliAccount(String cUserAliAccount) {
        this.cUserAliAccount = cUserAliAccount == null ? null : cUserAliAccount.trim();
    }

    public String getcVerifyState() {
        return cVerifyState;
    }

    public void setcVerifyState(String cVerifyState) {
        this.cVerifyState = cVerifyState == null ? null : cVerifyState.trim();
    }
}