package com.epam.training.library.datamodel;

public class Customers {
	private Integer customerId;
	private String customerName;
	private String customerPass;
	private Integer rightId;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customersId) {
		this.customerId = customersId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPass() {
		return customerPass;
	}
	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}
	public Integer getRightId() {
		return rightId;
	}
	public void setRightId(Integer rightId) {
		this.rightId = rightId;
	}

}
