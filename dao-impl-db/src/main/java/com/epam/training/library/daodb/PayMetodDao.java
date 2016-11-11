package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.PayMetod;

public interface PayMetodDao {
	
		PayMetod get(Integer id);

	    void save(PayMetod entity);

	    void delete(Integer id);

	    List<PayMetod> getAll();
}
