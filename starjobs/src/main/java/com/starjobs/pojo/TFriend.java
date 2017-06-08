package com.starjobs.pojo;

public class TFriend {
    private Integer cId;

    private String cUid;

    private String cFid;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcUid() {
        return cUid;
    }

    public void setcUid(String cUid) {
        this.cUid = cUid == null ? null : cUid.trim();
    }

    public String getcFid() {
        return cFid;
    }

    public void setcFid(String cFid) {
        this.cFid = cFid == null ? null : cFid.trim();
    }
}