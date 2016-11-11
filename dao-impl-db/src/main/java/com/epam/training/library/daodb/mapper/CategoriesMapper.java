package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.training.library.datamodel.Categories;

public class CategoriesMapper {

	 public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer categoriesId = rs.getInt("categories_id");
	        String categoriesName = rs.getString("categories_name");
	        
	        
	        Categories entity = new Categories();
	        
	        entity.setCategoriesId(categoriesId);
	        entity.setCategoriesName(categoriesName);
	        return entity;
	 }
}
