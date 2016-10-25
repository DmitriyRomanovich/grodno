package com.epam.training.library.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.epam.training.library.datamodel.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:service-context.xml")
public class BookServiceTest {

    @Inject
    private BookService bookService;

    @Test
    public void getByIdtest() {
        Book book = bookService.get(1l);

        Assert.assertNotNull("book for id=1 should not be null", book);
        Assert.assertEquals(new Long(1), book.getId());
    }

}
