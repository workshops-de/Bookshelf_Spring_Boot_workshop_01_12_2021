package de.workshops.bookshelf.controllers;

import de.workshops.bookshelf.services.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(BookController.REQUEST_URL)
@Slf4j
public class BookController {

    public static final String REQUEST_URL = "/";

    private final BookService bookService;

    public BookController(
            BookService bookService
    ) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getBooks());

        return "books";
    }

    @GetMapping("/success")
    public String redirectToSuccessUrl(Model model) {
        log.info("Redirecting to form login success URL");

        model.addAttribute("books", bookService.getBooks());

        return "success";
    }
}
