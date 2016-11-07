package com.epam.training.library.datamodel;

public class Accounts {
	private Integer accountId;
	private Integer customerId;
	private String accountName;
	private Float currentBallance;
	private String accountMail;
	
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Float getCurrentBallance() {
		return currentBallance;
	}
	public void setCurrentBallance(Float currentBallance) {
		this.currentBallance = currentBallance;
	}
	public String getAccountMail() {
		return accountMail;
	}
	public void setAccountMail(String accountMail) {
		this.accountMail = accountMail;
	}
}
