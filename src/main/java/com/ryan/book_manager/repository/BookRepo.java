package com.ryan.book_manager.repository;

import com.ryan.book_manager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Long> {
    void deleteBookById(Long id);

    Optional<Book> findBookById(Long id);
}
