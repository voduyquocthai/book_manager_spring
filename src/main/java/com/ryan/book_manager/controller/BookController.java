package com.ryan.book_manager.controller;

import com.ryan.book_manager.model.Book;
import com.ryan.book_manager.service.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private final IBookService bookService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Book>> getAllBooks(){
        Iterable<Book> books = bookService.findAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        Book book = bookService.findBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book newBook = bookService.saveBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book updateBook = bookService.saveBook(book);
        return new ResponseEntity<>(updateBook, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBook(@RequestParam Long id){
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }





}
