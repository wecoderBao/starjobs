package com.starjobs.pojo;

public class TCompanyInfo {
    private Integer cComId;

    private String cComPhone;

    private String cComPassword;

    private String cComName;

    private Integer cComBalance;

    private Integer cComScore;

    private String cComHeadImg;

    private Integer cComAddressId;

    private String cComLicenseImg;

    private String cUserState;

    private Integer cExtraBalance;

    private String cComDesc;

    public Integer getcComId() {
        return cComId;
    }

    public void setcComId(Integer cComId) {
        this.cComId = cComId;
    }

    public String getcComPhone() {
        return cComPhone;
    }

    public void setcComPhone(String cComPhone) {
        this.cComPhone = cComPhone == null ? null : cComPhone.trim();
    }

    public String getcComPassword() {
        return cComPassword;
    }

    public void setcComPassword(String cComPassword) {
        this.cComPassword = cComPassword == null ? null : cComPassword.trim();
    }

    public String getcComName() {
        return cComName;
    }

    public void setcComName(String cComName) {
        this.cComName = cComName == null ? null : cComName.trim();
    }

    public Integer getcComBalance() {
        return cComBalance;
    }

    public void setcComBalance(Integer cComBalance) {
        this.cComBalance = cComBalance;
    }

    public Integer getcComScore() {
        return cComScore;
    }

    public void setcComScore(Integer cComScore) {
        this.cComScore = cComScore;
    }

    public String getcComHeadImg() {
        return cComHeadImg;
    }

    public void setcComHeadImg(String cComHeadImg) {
        this.cComHeadImg = cComHeadImg == null ? null : cComHeadImg.trim();
    }

    public Integer getcComAddressId() {
        return cComAddressId;
    }

    public void setcComAddressId(Integer cComAddressId) {
        this.cComAddressId = cComAddressId;
    }

    public String getcComLicenseImg() {
        return cComLicenseImg;
    }

    public void setcComLicenseImg(String cComLicenseImg) {
        this.cComLicenseImg = cComLicenseImg == null ? null : cComLicenseImg.trim();
    }

    public String getcUserState() {
        return cUserState;
    }

    public void setcUserState(String cUserState) {
        this.cUserState = cUserState == null ? null : cUserState.trim();
    }

    public Integer getcExtraBalance() {
        return cExtraBalance;
    }

    public void setcExtraBalance(Integer cExtraBalance) {
        this.cExtraBalance = cExtraBalance;
    }

    public String getcComDesc() {
        return cComDesc;
    }

    public void setcComDesc(String cComDesc) {
        this.cComDesc = cComDesc == null ? null : cComDesc.trim();
    }
}