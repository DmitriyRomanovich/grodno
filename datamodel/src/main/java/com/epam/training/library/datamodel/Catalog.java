package com.epam.training.library.datamodel;

public class Catalog {
	private Integer productId;
	private String productName;
	private Float productPrice; 
	private String categoriesId;
	private Integer yearsId;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	public String getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(String categoriesId) {
		this.categoriesId = categoriesId;
	}
	public Integer getYearsId() {
		return yearsId;
	}
	public void setYearsId(Integer yearsId) {
		this.yearsId = yearsId;
	}
}
