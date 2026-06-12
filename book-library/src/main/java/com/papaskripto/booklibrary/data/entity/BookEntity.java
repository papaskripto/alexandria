package com.papaskripto.booklibrary.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table (name = "BOOKS")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)

    @Column (name = "ID")
    private UUID id;

    @Column (name = "TITLE")
    private String title;

    @Column (name = "AUTHOR")
    private String author;

    @Column (name = "ISBN")
    private String isbn;

    @Column (name = "PUBLISHER")
    private String publisher;

    @Column (name = "PUBLICATION_DATE")
    private LocalDate publicationDate;

    @Column (name = "PAGES")
    private int pages;

    @Column (name = "LANGUAGE")
    private String language;

    @Column (name = "QUANTITY")
    private int quantity;

    @Column (name = "CREATED_AT", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column (name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;

}
