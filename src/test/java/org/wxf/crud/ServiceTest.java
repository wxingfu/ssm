package org.wxf.crud;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wxf.crud.pojo.Books;
import org.wxf.crud.service.BookService;

import java.util.List;

public class ServiceTest extends BaseTest{

    @Autowired
    private BookService bookService;

    @Test
    public void test() {
        List<Books> books = bookService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
