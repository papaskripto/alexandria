package com.papaskripto.booklibrary.service;

import com.papaskripto.booklibrary.data.entity.BookEntity;
import com.papaskripto.booklibrary.data.repository.BookRepository;
import com.papaskripto.booklibrary.web.model.Book;
import org.springframework.stereotype.Service;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // List books
    public List<Book> listBooks () {
        List<BookEntity> bookEntities = this.bookRepository.findAll();
        List<Book> books = new ArrayList<>(bookEntities.size ());
        bookEntities.forEach(book -> books.add (getBookFromEntity (book)));
        return books;
    }

    // Get a book by id
    public Book getBookById (UUID id) {
        Optional<BookEntity> bookEntity = this.bookRepository.findById(id);
        if (bookEntity.isEmpty ()) {
            return null;
        } else {
            return this.getBookFromEntity(bookEntity.get());
        }
    }

    // Add a book to the library
    public Book addBook (Book book) {
        BookEntity bookEntity = this.getBookEntityFromBook (book);
        bookEntity = this.bookRepository.save (bookEntity);
        return this.getBookFromEntity (bookEntity);
    }

    // Update book
    public Book updateBook (Book book) {
        BookEntity bookEntity = this.getBookEntityFromBook (book);
        bookEntity = this.bookRepository.save (bookEntity);
        return this.getBookFromEntity (bookEntity);
    }

    // Remove book
    public void removeBook (UUID id) {
        this.bookRepository.deleteById(id);
    }

    // Helper functions
    private Book getBookFromEntity (BookEntity bookEntity) {
        return new Book(bookEntity.getId(), bookEntity.getTitle(), bookEntity.getAuthor(),
                bookEntity.getIsbn(), bookEntity.getPublisher(), bookEntity.getPublicationDate(),
                bookEntity.getPages(), bookEntity.getLanguage(), bookEntity.getQuantity(),
                bookEntity.getCreatedAt(), bookEntity.getUpdatedAt());
    }

    private BookEntity getBookEntityFromBook (Book book) {
        return new BookEntity(book.getId(), book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPublisher(),
                book.getPublicationDate(), book.getPages(), book.getLanguage(), book.getQuantity(), book.getCreatedAt(),
                book.getUpdatedAt());
    }
}
