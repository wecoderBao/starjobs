package com.starjobs.pojo;

import java.util.Date;

public class TUserJobApply {
    private Integer cApplyId;

    private Integer cUserId;

    private Integer cJobId;

    private Date cApplyTime;

    private String cApplyState;

    private String cApplyDesc;

    public Integer getcApplyId() {
        return cApplyId;
    }

    public void setcApplyId(Integer cApplyId) {
        this.cApplyId = cApplyId;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }

    public Integer getcJobId() {
        return cJobId;
    }

    public void setcJobId(Integer cJobId) {
        this.cJobId = cJobId;
    }

    public Date getcApplyTime() {
        return cApplyTime;
    }

    public void setcApplyTime(Date cApplyTime) {
        this.cApplyTime = cApplyTime;
    }

    public String getcApplyState() {
        return cApplyState;
    }

    public void setcApplyState(String cApplyState) {
        this.cApplyState = cApplyState == null ? null : cApplyState.trim();
    }

    public String getcApplyDesc() {
        return cApplyDesc;
    }

    public void setcApplyDesc(String cApplyDesc) {
        this.cApplyDesc = cApplyDesc == null ? null : cApplyDesc.trim();
    }
}