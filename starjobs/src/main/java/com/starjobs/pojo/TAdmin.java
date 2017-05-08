package com.starjobs.pojo;

public class TAdmin {
    private Integer cAdminId;

    private String cAdminName;

    private String cAdminPassword;

    private String cAdminDesc;

    public Integer getcAdminId() {
        return cAdminId;
    }

    public void setcAdminId(Integer cAdminId) {
        this.cAdminId = cAdminId;
    }

    public String getcAdminName() {
        return cAdminName;
    }

    public void setcAdminName(String cAdminName) {
        this.cAdminName = cAdminName == null ? null : cAdminName.trim();
    }

    public String getcAdminPassword() {
        return cAdminPassword;
    }

    public void setcAdminPassword(String cAdminPassword) {
        this.cAdminPassword = cAdminPassword == null ? null : cAdminPassword.trim();
    }

    public String getcAdminDesc() {
        return cAdminDesc;
    }

    public void setcAdminDesc(String cAdminDesc) {
        this.cAdminDesc = cAdminDesc == null ? null : cAdminDesc.trim();
    }
}