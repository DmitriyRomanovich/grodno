package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.epam.training.library.datamodel.Accounts;
import com.epam.training.library.datamodel.Catalog;

public class CatalogMapper {
	 public Catalog mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer productId = rs.getInt("product_id");
	        String productName = rs.getString("product_name");
	        Float productPrice = rs.getFloat("product_price");
	        Integer categoriesId = rs.getInt("categories_id");
	        Integer yearsId = rs.getInt("years_id");
	        
	        Catalog entity = new Catalog();
	        entity.setProductId(productId);
	        entity.setProductName(productName);
	        entity.setProductPrice(productPrice);
	        entity.setCategoriesId(categoriesId);
	        entity.setYearsId(yearsId);
	          
	        return entity;
	    }
}
