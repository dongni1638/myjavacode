package com.icebery.myjavacode.repository;

import com.icebery.myjavacode.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: 低调的小码农
 * @Date: 2020/12/28 8:21 PM
 * @Version 1.0
 */
public interface BookRepositiry extends JpaRepository<Book,Integer> {
}
