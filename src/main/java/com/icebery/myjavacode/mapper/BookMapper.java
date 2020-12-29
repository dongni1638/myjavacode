package com.icebery.myjavacode.mapper;

import com.icebery.myjavacode.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    public Book getBookById(Integer id);


    public void insertBook(Book book);
}
