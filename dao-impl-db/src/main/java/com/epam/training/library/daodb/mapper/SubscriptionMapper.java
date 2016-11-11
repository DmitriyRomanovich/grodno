package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.epam.training.library.datamodel.subscriptions;
import com.epam.training.library.datamodel.Subscription;

public class SubscriptionMapper {
	 public Subscription mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer subscriptionId = rs.getInt("subscriptions_id");
	        Integer accountId = rs.getInt("account_id");
	        Long dateSubscriptionPlaced = rs.getLong("date_subscription_placed");
	        String subscriptionDetails = rs.getString("subscription_details");
	        Integer paymentId = rs.getInt("customer_ballance");
	        Long dateSubscriptionOff = rs.getLong("date_subscription_off");
	        
	        
	        Subscription entity = new Subscription();
	        
	        entity.setSubscriptionId(subscriptionId);
	        entity.setAccountId(accountId);
	        entity.setDateSubscriptionPlaced(dateSubscriptionPlaced);
	        entity.setSubscriptionDetails(subscriptionDetails);
	        entity.setPaymentId(paymentId);
	        entity.setDateSubscriptionOff(dateSubscriptionOff);
	        return entity;
	 }
	 
}