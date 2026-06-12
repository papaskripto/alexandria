package com.papaskripto.booklibrary.web.controller;

import com.papaskripto.booklibrary.data.entity.BookEntity;
import com.papaskripto.booklibrary.data.repository.BookRepository;
import com.papaskripto.booklibrary.web.model.Book;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/books")

public class BookController {

    private final BookRepository bookRepository;

    public BookController (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public String libraryPage (Model model) {
        List<BookEntity> bookEntities = this.bookRepository.findAll();
        List<Book> books = new ArrayList<>(bookEntities.size ());
        bookEntities.forEach(book -> books.add(new Book(book.getId(), book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPublisher(), book.getPublicationDate(), book.getPages(), book.getLanguage(), book.getQuantity(), book.getCreatedAt(), book.getUpdatedAt())));
        model.addAttribute("books", books);
        return "library";
    }
}
