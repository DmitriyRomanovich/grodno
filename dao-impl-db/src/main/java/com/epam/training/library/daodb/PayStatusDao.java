package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.PayStatus;

public interface PayStatusDao {
	void save(PayStatus entity);

    void delete(Integer id);

    List<PayStatus> getAll();

	PayStatus get(Integer id);

}
