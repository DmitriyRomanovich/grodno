package com.epam.training.library.daodb.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.training.library.daodb.AccountsDao;
import com.epam.training.library.datamodel.Accounts;

@Repository
public class AccountDaoImpl implements AccountsDao{

	@Override
    public Accounts getAccounts(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
	public void saveAccounts(Accounts entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccounts(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Accounts> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
