package com.starjobs.pojo;

public class TUserLikeCom {
    private Integer id;

    private String userPhone;

    private String comPhone;

    private String likeDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getComPhone() {
        return comPhone;
    }

    public void setComPhone(String comPhone) {
        this.comPhone = comPhone == null ? null : comPhone.trim();
    }

    public String getLikeDesc() {
        return likeDesc;
    }

    public void setLikeDesc(String likeDesc) {
        this.likeDesc = likeDesc == null ? null : likeDesc.trim();
    }
}