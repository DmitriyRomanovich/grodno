package com.epam.training.library.datamodel;

public class Subscription {
	private Integer subscriptionId;
	private Integer accountId;
	private Long date;
	private String subscriptionDetails;
	private Integer dateSubscriptionOff;
	
	public Integer getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	
	public String getSubscriptionDetails() {
		return subscriptionDetails;
	}
	public void setSubscriptionDetails(String subscriptionDetails) {
		this.subscriptionDetails = subscriptionDetails;
	}
	public Integer getDateSubscriptionOff() {
		return dateSubscriptionOff;
	}
	public void setDateSubscriptionOff(Integer dateSubscriptionOff) {
		this.dateSubscriptionOff = dateSubscriptionOff;
	}
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
}
