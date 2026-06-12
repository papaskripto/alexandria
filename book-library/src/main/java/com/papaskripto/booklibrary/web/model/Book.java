package com.papaskripto.booklibrary.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private UUID id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private LocalDate publicationDate;
    private int pages;
    private String language;
    private int quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
