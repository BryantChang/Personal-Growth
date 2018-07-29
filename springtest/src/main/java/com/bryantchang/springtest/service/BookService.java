package com.bryantchang.springtest.service;

import com.bryantchang.springtest.dao.IBookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookService {
    IBookDAO bookDAO;

    public BookService() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("IOCBean1.xml");
        bookDAO = (IBookDAO)ctx.getBean("bookdao");
    }

    public void storeBook(String bookName) {
        System.out.println("New book comming...");
        String result = bookDAO.addBook(bookName);
        System.out.println(result);
    }
}
