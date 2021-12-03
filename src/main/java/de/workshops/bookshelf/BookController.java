package de.workshops.bookshelf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(BookController.REQUEST_URL)
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
}
