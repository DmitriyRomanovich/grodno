package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Catalog;

public interface CategoriesDao {
		
	 void save(Catalog entity);

	    void delete(Integer id);

	    List<Catalog> getAllCatalog();

		Catalog get(Integer id);
}
