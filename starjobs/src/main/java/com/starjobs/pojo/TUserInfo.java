package com.starjobs.pojo;

import java.util.Date;

public class TUserInfo {
    private Integer cUserId;

    private String cUserPhone;

    private String cUserPassword;

    private String cUserNickname;

    private String cUsername;

    private String cUserAliAccount;

    private String cUserGender;

    private Date cUserBirthDate;

    private String cUserHeight;

    private String cUserEduState;

    private String cUserSchoolName;

    private Integer cUserBalance;

    private Integer cUserScore;

    private String cUserImg;

    private String cUserState;

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    public String getcUserPhone() {
        return cUserPhone;
    }

    public void setcUserPhone(String cUserPhone) {
        this.cUserPhone = cUserPhone == null ? null : cUserPhone.trim();
    }

    public String getcUserPassword() {
        return cUserPassword;
    }

    public void setcUserPassword(String cUserPassword) {
        this.cUserPassword = cUserPassword == null ? null : cUserPassword.trim();
    }

    public String getcUserNickname() {
        return cUserNickname;
    }

    public void setcUserNickname(String cUserNickname) {
        this.cUserNickname = cUserNickname == null ? null : cUserNickname.trim();
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    public String getcUserAliAccount() {
        return cUserAliAccount;
    }

    public void setcUserAliAccount(String cUserAliAccount) {
        this.cUserAliAccount = cUserAliAccount == null ? null : cUserAliAccount.trim();
    }

    public String getcUserGender() {
        return cUserGender;
    }

    public void setcUserGender(String cUserGender) {
        this.cUserGender = cUserGender == null ? null : cUserGender.trim();
    }

    public Date getcUserBirthDate() {
        return cUserBirthDate;
    }

    public void setcUserBirthDate(Date cUserBirthDate) {
        this.cUserBirthDate = cUserBirthDate;
    }

    public String getcUserHeight() {
        return cUserHeight;
    }

    public void setcUserHeight(String cUserHeight) {
        this.cUserHeight = cUserHeight == null ? null : cUserHeight.trim();
    }

    public String getcUserEduState() {
        return cUserEduState;
    }

    public void setcUserEduState(String cUserEduState) {
        this.cUserEduState = cUserEduState == null ? null : cUserEduState.trim();
    }

    public String getcUserSchoolName() {
        return cUserSchoolName;
    }

    public void setcUserSchoolName(String cUserSchoolName) {
        this.cUserSchoolName = cUserSchoolName == null ? null : cUserSchoolName.trim();
    }

    public Integer getcUserBalance() {
        return cUserBalance;
    }

    public void setcUserBalance(Integer cUserBalance) {
        this.cUserBalance = cUserBalance;
    }

    public Integer getcUserScore() {
        return cUserScore;
    }

    public void setcUserScore(Integer cUserScore) {
        this.cUserScore = cUserScore;
    }

    public String getcUserImg() {
        return cUserImg;
    }

    public void setcUserImg(String cUserImg) {
        this.cUserImg = cUserImg == null ? null : cUserImg.trim();
    }

    public String getcUserState() {
        return cUserState;
    }

    public void setcUserState(String cUserState) {
        this.cUserState = cUserState == null ? null : cUserState.trim();
    }
}