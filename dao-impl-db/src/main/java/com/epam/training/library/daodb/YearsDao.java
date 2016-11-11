package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Years;

public interface YearsDao {
	 void save(Years entity);

	    void delete(Integer id);

	    List<Years> getAllCatalog();

		Years get(Integer id);
}
