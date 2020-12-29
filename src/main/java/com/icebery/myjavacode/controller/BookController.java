package com.icebery.myjavacode.controller;

import com.icebery.myjavacode.entity.Book;
import com.icebery.myjavacode.mapper.BookMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookMapper bookMapper;

    @GetMapping("/getbook/{id}")
    public Book getBook(@PathVariable("id") Integer id) {
        return bookMapper.getBookById(id);
    }

    @GetMapping("/insertbook")
    public void insertBook() {
        Book book=new Book();
        //book.setId(5);
        book.setName("testinsert");
        book.setAnthor("wang");

        bookMapper.insertBook(book);
    }
}
