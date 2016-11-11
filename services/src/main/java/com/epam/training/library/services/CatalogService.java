package com.epam.training.library.services;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.epam.training.library.datamodel.Catalog;

public interface CatalogService {
	
	@Transactional
	 void saveAll(ArrayList<Catalog> accounts);

	    Integer save(Catalog accounts);

	    ArrayList<Catalog> getAll();

		Catalog getCatalog(Long id);
}
