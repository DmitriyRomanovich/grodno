package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.training.library.datamodel.PayMetod;

public class PayMetodMapper {
		
	 public PayMetod mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer payMetodCode = rs.getInt("pay_metod_code");
	        String paymentMetodName = rs.getString("payment_metod_name");
	        
	        
	        PayMetod entity = new PayMetod();
	        
	        entity.setPaymentMetodCode(payMetodCode);
	        entity.setPaymentMetodName(paymentMetodName);
	        return entity;
	 }
}
