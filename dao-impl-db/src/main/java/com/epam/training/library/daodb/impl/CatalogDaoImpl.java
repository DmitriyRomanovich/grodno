package com.epam.training.library.daodb.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.epam.training.library.daodb.CatalogDao;
import com.epam.training.library.datamodel.Catalog;

@Repository
public class CatalogDaoImpl implements CatalogDao {

	@Inject
	    private JdbcTemplate jdbcTemplate;
	 
	@Override
	public Catalog get(Integer id) {
		 return jdbcTemplate.queryForObject(
	                "select * from catalog where id = ?",
	                new Object[] { id }, new BeanPropertyRowMapper<Catalog>(
	                        Catalog.class));
		
	}

	@Override
	public void save(Catalog entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Catalog> getAllCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
