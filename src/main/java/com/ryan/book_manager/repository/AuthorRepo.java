package com.ryan.book_manager.repository;

import com.ryan.book_manager.model.Author;
import com.ryan.book_manager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepo extends JpaRepository<Author, Long> {

    Optional<Author> findAuthorById(Long id);
}
