package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.training.library.datamodel.Accounts;

public class AccountsMapper {
	
	 public Accounts mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer accountId = rs.getInt("accounts_id");
	        Integer customerId = rs.getInt("customer_id");
	        String accountName = rs.getString("account_name");
	        Float customerBallance = rs.getFloat("customer_ballance");
	        String accountMail = rs.getString("account_mail");
	        
	        
	        Accounts entity = new Accounts();
	        entity.setAccountId(accountId);
	        entity.setCustomerId(customerId);
	        entity.setAccountName(accountName);
	        entity.setCurrentBallance(customerBallance);
	        entity.setAccountMail(accountMail);
	        return entity;
	    }
}
