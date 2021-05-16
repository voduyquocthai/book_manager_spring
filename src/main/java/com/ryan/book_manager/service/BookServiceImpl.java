package com.ryan.book_manager.service;

import com.ryan.book_manager.exception.BookNotFoundException;
import com.ryan.book_manager.model.Book;
import com.ryan.book_manager.repository.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class BookServiceImpl implements IBookService {


    private final BookRepo bookRepo;

    @Override
    public Iterable<Book> findAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Book findBookById(Long id) {
        return bookRepo.findBookById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with this id:" + id + "was not found"));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepo.deleteBookById(id);
    }
}
