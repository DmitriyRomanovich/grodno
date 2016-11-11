package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.training.library.datamodel.Customers;
//import com.epam.training.library.datamodel.Subscription;

public class CustomersMapper {
	
	 public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer customerId = rs.getInt("customer_id");
	        String customerName = rs.getString("customer_name");
	        String customerPass = rs.getString("customer_pass");
	        Integer rightId = rs.getInt("right_id");
	        
	        
	        Customers entity = new Customers();
	        
	        entity.setCustomerId(customerId);
	        entity.setCustomerName(customerName);
	        entity.setCustomerPass(customerPass);
	        entity.setRightId(rightId);
	        return entity;
	 }
}
