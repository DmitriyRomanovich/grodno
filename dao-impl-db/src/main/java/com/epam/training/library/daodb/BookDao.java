package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Book;

public interface BookDao {

    Book get(Long id);

    void insert(Book entity);

    void update(Book entity);

    void delete(Long id);

    List<Book> getAll();
}
