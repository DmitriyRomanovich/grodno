package com.epam.training.library.daodb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.training.library.datamodel.Right;

public class RightMapper {

	 public Right mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer rightId = rs.getInt("right_id");
	        String rightName = rs.getString("right_name");

	        Right entity = new Right();
	        entity.setRightId(rightId);
	        entity.setRightName(rightName);
	          
	        return entity;
	    }

}
