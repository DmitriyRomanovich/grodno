package com.epam.training.library.services;

import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;

import com.epam.training.library.datamodel.Accounts;

public interface AccountsService {
		
	@Transactional
	 void saveAll(ArrayList<Accounts> accounts);

	    Integer save(Accounts accounts);

	    ArrayList<Accounts> getAll();

		Accounts getAccounts(Long id);
}
