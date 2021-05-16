package com.ryan.book_manager.service;

import com.ryan.book_manager.exception.AuthorNotFoundException;
import com.ryan.book_manager.exception.BookNotFoundException;
import com.ryan.book_manager.model.Author;
import com.ryan.book_manager.repository.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class AuthorServiceImpl implements IAuthorService{


    private final AuthorRepo authorRepo;

    @Override
    public Iterable<Author> findAllAuthors() {
        return authorRepo.findAll();
    }

    @Override
    public Author findAuthorById(Long id) {
        return authorRepo.findAuthorById(id)
                .orElseThrow(() -> new AuthorNotFoundException("Author with this id:" + id + "was not found"));
    }
}
