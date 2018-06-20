package com.starjobs.pojo;

import java.util.Date;

public class TFeedback {
    private Integer id;

    private String phone;

    private String picOne;

    private String picTow;

    private String picThree;

    private String content;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPicOne() {
        return picOne;
    }

    public void setPicOne(String picOne) {
        this.picOne = picOne == null ? null : picOne.trim();
    }

    public String getPicTow() {
        return picTow;
    }

    public void setPicTow(String picTow) {
        this.picTow = picTow == null ? null : picTow.trim();
    }

    public String getPicThree() {
        return picThree;
    }

    public void setPicThree(String picThree) {
        this.picThree = picThree == null ? null : picThree.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}