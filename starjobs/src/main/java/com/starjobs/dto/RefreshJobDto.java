package com.starjobs.dto;

public class RefreshJobDto {
	
	private String jobName;
	private long createTime;
	private Integer refreshType;
	private String cost;
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public Integer getRefreshType() {
		return refreshType;
	}
	public void setRefreshType(Integer refreshType) {
		this.refreshType = refreshType;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	

}
