package com.epam.training.library.services;

import java.util.List;

import com.epam.training.library.datamodel.Book;

public interface BookService {

    void saveAll(List<Book> books);

    void save(Book book);

    Book get(Long id);

}
