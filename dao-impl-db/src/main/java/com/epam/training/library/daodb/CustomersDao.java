package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Customers;

public interface CustomersDao {

	 Customers get(Integer id);

	    void save(Customers entity);

	    void delete(Integer id);

	    List<Customers> getAllCustomers();
}
