package com.test.cglibproxy;

/**
 * @author WH1707008
 * @date 2018/6/5 15:27
 */
public class TestCglib {
    public static void main(String[] args) {
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl bookCglib = (BookFacadeImpl) cglib.getInstance(new BookFacadeImpl());
        bookCglib.addBook();
    }
}
