package com.epam.training.library.services.impl;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.epam.training.library.datamodel.Accounts;

public class AccountsSaveTest {
@Test
void saveAll(ArrayList<Accounts> accounts);

   Integer save(Accounts accounts);

   ArrayList<Accounts> getAll();

	Accounts getAccounts(Long id);
}
