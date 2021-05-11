package com.ryan.book_manager.repository;

import com.ryan.book_manager.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
