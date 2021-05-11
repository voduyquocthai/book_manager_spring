package com.ryan.book_manager.service;

import com.ryan.book_manager.exception.BookNotFoundException;
import com.ryan.book_manager.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    Iterable<Book> findAllBooks();

    Book saveBook(Book book);

    Book findBookById(Long id) throws BookNotFoundException;

    void deleteBook(Long id);
}
