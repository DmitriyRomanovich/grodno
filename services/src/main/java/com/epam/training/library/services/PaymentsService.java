package com.epam.training.library.services;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.epam.training.library.datamodel.Payments;

public interface PaymentsService {
	
	@Transactional
	 void saveAll(ArrayList<Payments> accounts);

	    Integer save(Payments accounts);

	    ArrayList<Payments> getAll();

		Payments getPayment(Long id);
}
