package com.ryan.book_manager.service;

import com.ryan.book_manager.exception.BookNotFoundException;
import com.ryan.book_manager.model.Book;


public interface IBookService {

    Iterable<Book> findAllBooks();

    Book saveBook(Book book);

    Book findBookById(Long id);

    void deleteBook(Long id);
}
