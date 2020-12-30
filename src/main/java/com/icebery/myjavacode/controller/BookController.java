package com.icebery.myjavacode.controller;

import com.icebery.myjavacode.entity.Book;
import com.icebery.myjavacode.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired BookService bookService;


    @GetMapping("/getbook/{id}")
    public Book getBook(@PathVariable("id") Integer id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/insertbook")
    public void insertBook() {
        bookService.insertBook();
    }
}
