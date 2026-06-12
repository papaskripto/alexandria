package com.papaskripto.booklibrary.web.controller;

import com.papaskripto.booklibrary.data.entity.BookEntity;
import com.papaskripto.booklibrary.data.repository.BookRepository;
import com.papaskripto.booklibrary.service.BookService;
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

    private final BookService bookService;

    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String libraryPage (Model model) {
        model.addAttribute("books", this.bookService.listBooks());
        return "library";
    }
}
