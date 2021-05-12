package com.ryan.book_manager.controller;

import com.ryan.book_manager.model.Author;
import com.ryan.book_manager.model.Book;
import com.ryan.book_manager.service.IAuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/author")
@AllArgsConstructor
public class AuthorController {

    private final IAuthorService authorService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Author>> getAllAuthors(){
        Iterable<Author> authors = authorService.findAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id){
        Author author = authorService.findAuthorById(id);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }
}
