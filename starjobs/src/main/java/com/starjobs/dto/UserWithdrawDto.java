package com.starjobs.dto;

public class UserWithdrawDto {
	private String withdrawMoney;

    private long createTime;

    private String balance;

	public String getWithdrawMoney() {
		return withdrawMoney;
	}

	public void setWithdrawMoney(String withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
    
}
