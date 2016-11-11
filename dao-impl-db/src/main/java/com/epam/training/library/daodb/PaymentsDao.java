package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Payments;

public interface PaymentsDao {
	 Payments get(Integer id);

	    void save(Payments entity);

	    void delete(Long id);

	    List<Payments> getAll();
}
