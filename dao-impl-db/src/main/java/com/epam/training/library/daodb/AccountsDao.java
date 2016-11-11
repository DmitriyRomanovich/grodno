package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Accounts;

public interface AccountsDao {

	    void saveAccounts(Accounts entity);

	    void deleteAccounts(Integer id);

	    List<Accounts> getAllAccounts();

		Accounts getAccounts(Integer id);
}
