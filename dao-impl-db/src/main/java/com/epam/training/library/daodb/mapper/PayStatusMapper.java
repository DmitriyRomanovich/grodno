package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.training.library.datamodel.PayStatus;

public class PayStatusMapper {
		
	 public PayStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer paymentStatusCode = rs.getInt("payment_status_code");
	        Boolean paymentStatus = rs.getBoolean("payment_status");
	        
	        
	        PayStatus entity = new PayStatus();
	        
	        entity.setPaymentStatusCode(paymentStatusCode);
	        entity.setPaymentStatus(paymentStatus);
	        
	        return entity;
	 }
}
