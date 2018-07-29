package com.bryantchang.springtest.dao;

public class BookDAO implements IBookDAO {
    @Override
    public String addBook(String bookName) {
        return "添加图书" + bookName + "成功";
    }
}
