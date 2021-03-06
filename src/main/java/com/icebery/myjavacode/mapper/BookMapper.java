package com.icebery.myjavacode.mapper;

import com.icebery.myjavacode.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    Book getBookById(Integer id);

    Book getBookByName(String name);


    void insertBook(Book book);
}
