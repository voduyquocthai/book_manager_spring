package com.ryan.book_manager.service;

import com.ryan.book_manager.model.Author;
import com.ryan.book_manager.repository.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements IAuthorService{


    private final AuthorRepo authorRepo;

    @Override
    public Iterable<Author> findAllBooks() {
        return authorRepo.findAll();
    }
}
