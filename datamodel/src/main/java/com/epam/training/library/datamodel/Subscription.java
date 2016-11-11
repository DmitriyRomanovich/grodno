package com.epam.training.library.datamodel;

public class Subscription {
	private Integer subscriptionId;
	private Integer accountId;
	private Long dateSubscriptionPlaced;
	private String subscriptionDetails;
	private Integer paymentId;
	private Long dateSubscriptionOff;
	
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
	public Long getDateSubscriptionOff() {
		return dateSubscriptionOff;
	}
	public void setDateSubscriptionOff(Long dateSubscriptionOff) {
		this.dateSubscriptionOff = dateSubscriptionOff;
	}
	
	public Long getDateSubscriptionPlaced() {
		return dateSubscriptionPlaced;
	}
	public void setDateSubscriptionPlaced(Long dateSubscriptionPlaced) {
		this.dateSubscriptionPlaced = dateSubscriptionPlaced;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
}
