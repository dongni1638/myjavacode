package com.icebery.myjavacode.service.impl;

import com.icebery.myjavacode.entity.Book;
import com.icebery.myjavacode.mapper.BookMapper;
import com.icebery.myjavacode.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public Book getBookById(Integer id){

        return bookMapper.getBookById(id);

    }
    @Override
    public Book getBookByName(String name){

        return bookMapper.getBookByName(name);

    }
    public void insertBook(){

        Book book=new Book();
        book.setName("test01");
        book.setAnthor("anthor01");

        bookMapper.insertBook(book);

    }
}
