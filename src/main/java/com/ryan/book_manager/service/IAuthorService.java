package com.ryan.book_manager.service;

import com.ryan.book_manager.model.Author;
import com.ryan.book_manager.model.Book;

public interface IAuthorService {

    Iterable<Author> findAllAuthors();

    Author findAuthorById(Long id);
}
