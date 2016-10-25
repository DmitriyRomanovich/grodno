package com.epam.training.library.daodb.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.epam.training.library.daodb.BookDao;
import com.epam.training.library.datamodel.Book;

@Repository
public class BookDaoImpl implements BookDao {

    @Inject
    private JdbcTemplate jdbcTemplate;

    @Override
    public Book get(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from book where id = ?",
                new Object[] { id }, new BeanPropertyRowMapper<Book>(
                        Book.class));
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Book> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(Book entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Book entity) {
        // TODO Auto-generated method stub

    }

}
