package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Right;

public interface RightDao {
		Right get(Integer id);

	    void save(Right entity);

	    void delete(Integer id);

	    List<Right> getAll();
}
