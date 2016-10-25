package com.epam.training.library.services.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.epam.training.library.daodb.BookDao;
import com.epam.training.library.datamodel.Book;
import com.epam.training.library.services.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Inject
    private BookDao bookDao;

    @Override
    public Book get(Long id) {
        return bookDao.get(id);
    }

    @Override
    public void saveAll(List<Book> books) {
        for (Book book : books) {
            save(book);
        }

    }

    @Override
    public void save(Book book) {

        if (book.getId() == null) {
            bookDao.insert(book);
        } else {
            bookDao.update(book);
        }
    }

}
