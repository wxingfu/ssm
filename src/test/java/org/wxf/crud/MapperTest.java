package org.wxf.crud;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wxf.crud.dao.BookMapper;
import org.wxf.crud.pojo.Books;

import java.util.List;

public class MapperTest extends BaseTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test() {
        List<Books> books = bookMapper.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
