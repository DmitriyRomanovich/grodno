package com.epam.training.library.datamodel;

public class Catalog {
	private Integer productId;
	private String productName;
	private Float productPrice; 
	private Integer categoriesId;
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
	
	public Integer getYearsId() {
		return yearsId;
	}
	public void setYearsId(Integer yearsId) {
		this.yearsId = yearsId;
	}
	public Integer getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(Integer categoriesId) {
		this.categoriesId = categoriesId;
	}
}
