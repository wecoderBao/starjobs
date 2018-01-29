package com.starjobs.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RefreshJob {
    private Integer id;

    private Integer comId;

    private Integer jobId;

    private Date createTime;

    private BigDecimal refreshCost;

    private Integer refreshType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getRefreshCost() {
        return refreshCost;
    }

    public void setRefreshCost(BigDecimal refreshCost) {
        this.refreshCost = refreshCost;
    }

    public Integer getRefreshType() {
        return refreshType;
    }

    public void setRefreshType(Integer refreshType) {
        this.refreshType = refreshType;
    }
}