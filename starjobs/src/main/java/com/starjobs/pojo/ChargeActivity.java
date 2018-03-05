package com.starjobs.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ChargeActivity {
    private Integer id;

    private Date createTime;

    private BigDecimal cashnum;

    private String activityDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getCashnum() {
        return cashnum;
    }

    public void setCashnum(BigDecimal cashnum) {
        this.cashnum = cashnum;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }
}