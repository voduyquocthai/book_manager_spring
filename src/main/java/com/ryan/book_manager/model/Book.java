package com.ryan.book_manager.model;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.FetchType.LAZY;

@Entity
@Data
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    private Author author;
}
