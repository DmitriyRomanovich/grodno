package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.training.library.datamodel.Payments;
//import com.epam.training.library.datamodel.Subscription;

public class PaymentsMapper {
	 public Payments mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer paymentId = rs.getInt("payment_id");
	        Integer accountId = rs.getInt("account_id");
	        Integer productId = rs.getInt("product_id");
	        Integer paymentMetodCode = rs.getInt("payment_metod_code");
	        Integer paymentStatusCode = rs.getInt("payment_status_code");
	        Long dateOfPayment = rs.getLong("date_of_payment");
	        Integer amountOfPayment = rs.getInt("amount_of_payment");
	        String paymentDetails = rs.getString("payment_details");
	        
	        
	        Payments entity = new Payments();
	        
	        entity.setPaymentId(paymentId);
	        entity.setAccountId(accountId);
	        entity.setProductId(productId);
	        entity.setPaymentMetodCode(paymentMetodCode);
	        entity.setPaymentStatusCode(paymentStatusCode);
	        entity.setDateOfPayment(dateOfPayment);
	        entity.setAmountOfPayment(amountOfPayment);
	        entity.setPaymentDetails(paymentDetails);
	        return entity;
	 }
}
