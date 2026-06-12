package com.papaskripto.booklibrary.data.repository;

import com.papaskripto.booklibrary.data.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<BookEntity, UUID> {
}
