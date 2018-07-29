package com.bryantchang.springtest;

import com.bryantchang.springtest.service.BookService;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testStoreBook() {
        BookService service = new BookService();
        service.storeBook("《Java编程思想》");
    }
}
