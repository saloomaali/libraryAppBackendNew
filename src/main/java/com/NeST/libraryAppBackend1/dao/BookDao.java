package com.NeST.libraryAppBackend1.dao;

import com.NeST.libraryAppBackend1.model.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookDao extends CrudRepository<Book, Integer> {

    @Query(value = "SELECT `id`, `author`, `description`, `distributer`, `image`, `language`, `price`, `publisher`, `release_year`, `title` FROM `book` WHERE `title` = :title ",nativeQuery = true)
    List<Book> searchBook(String title);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `book` WHERE `id` = :id", nativeQuery = true)
    void deleteBook(int id);
}
