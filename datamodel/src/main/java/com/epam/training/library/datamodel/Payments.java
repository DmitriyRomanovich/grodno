package com.epam.training.library.datamodel;

public class Payments {
	private Integer paymentId;
	private Integer accountId;
	private Integer productId;
	private Integer paymentMetodCode;
	private Integer paymentStatusCode;
	private Long dateOfPayment;
	private Integer amountOfPayment;
	private String paymentDetails;
	
	public Integer getPaymentsId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentsId) {
		this.paymentId = paymentsId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getPaymentMetodCode() {
		return paymentMetodCode;
	}
	public void setPaymentMetodCode(Integer paymentMetodCode) {
		this.paymentMetodCode = paymentMetodCode;
	}
	public Integer getPaymentStatusCode() {
		return paymentStatusCode;
	}
	public void setPaymentStatusCode(Integer paymentStatusCode) {
		this.paymentStatusCode = paymentStatusCode;
	}
	public Long getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(Long dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public Integer getAmountOfPayment() {
		return amountOfPayment;
	}
	public void setAmountOfPayment(Integer amountOfPayment) {
		this.amountOfPayment = amountOfPayment;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
}
