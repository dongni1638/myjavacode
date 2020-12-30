package com.icebery.myjavacode.mapper;

import com.icebery.myjavacode.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    Book getBookById(Integer id);


    void insertBook(Book book);
}
