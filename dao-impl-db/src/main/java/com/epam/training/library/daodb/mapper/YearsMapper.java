package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.epam.training.library.datamodel.Payments;
import com.epam.training.library.datamodel.Years;

public class YearsMapper {
	
	 public Years mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer yearsId = rs.getInt("years_id");
	        Integer yearsName = rs.getInt("years_name");
	        
	        
	        Years entity = new Years();
	        
	        entity.setYearsId(yearsId);
	        entity.setYearsName(yearsName);
	        return entity;
	 }
}
