package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Author;

public interface AuthorDao {

    Author get(Long id);

    void save(Author entity);

    void delete(Long id);

    List<Author> getAll();

}
