package com.starjobs.pojo;

public class TGroupMember {
    private Integer cId;

    private Integer cGroupId;

    private String cGroupMemberId;

    private String cGroupMemberIdentity;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcGroupId() {
        return cGroupId;
    }

    public void setcGroupId(Integer cGroupId) {
        this.cGroupId = cGroupId;
    }

    public String getcGroupMemberId() {
        return cGroupMemberId;
    }

    public void setcGroupMemberId(String cGroupMemberId) {
        this.cGroupMemberId = cGroupMemberId == null ? null : cGroupMemberId.trim();
    }

    public String getcGroupMemberIdentity() {
        return cGroupMemberIdentity;
    }

    public void setcGroupMemberIdentity(String cGroupMemberIdentity) {
        this.cGroupMemberIdentity = cGroupMemberIdentity == null ? null : cGroupMemberIdentity.trim();
    }
}