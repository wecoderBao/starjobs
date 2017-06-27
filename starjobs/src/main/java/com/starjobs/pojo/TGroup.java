package com.starjobs.pojo;

public class TGroup {
    private Integer cGroupId;

    private String cGroupCreaterId;

    private String cGroupHeadImg;

    private String cGroupName;

    private String cGroupStatu;

    private String cJobId;

    public Integer getcGroupId() {
        return cGroupId;
    }

    public void setcGroupId(Integer cGroupId) {
        this.cGroupId = cGroupId;
    }

    public String getcGroupCreaterId() {
        return cGroupCreaterId;
    }

    public void setcGroupCreaterId(String cGroupCreaterId) {
        this.cGroupCreaterId = cGroupCreaterId == null ? null : cGroupCreaterId.trim();
    }

    public String getcGroupHeadImg() {
        return cGroupHeadImg;
    }

    public void setcGroupHeadImg(String cGroupHeadImg) {
        this.cGroupHeadImg = cGroupHeadImg == null ? null : cGroupHeadImg.trim();
    }

    public String getcGroupName() {
        return cGroupName;
    }

    public void setcGroupName(String cGroupName) {
        this.cGroupName = cGroupName == null ? null : cGroupName.trim();
    }

    public String getcGroupStatu() {
        return cGroupStatu;
    }

    public void setcGroupStatu(String cGroupStatu) {
        this.cGroupStatu = cGroupStatu == null ? null : cGroupStatu.trim();
    }

    public String getcJobId() {
        return cJobId;
    }

    public void setcJobId(String cJobId) {
        this.cJobId = cJobId == null ? null : cJobId.trim();
    }
}