package com.icebery.myjavacode.service;

import com.icebery.myjavacode.entity.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface BookService {
    Book getBookById(Integer id);

    Book getBookByName(String name);

    void insertBook();
}
