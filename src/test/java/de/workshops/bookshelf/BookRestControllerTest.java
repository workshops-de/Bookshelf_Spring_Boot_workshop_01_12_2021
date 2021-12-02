package de.workshops.bookshelf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookRestControllerTest {

    @Autowired
    private BookRestController bookRestController;

    @Test
    void testGetAllBooks() {
        assertEquals(3, bookRestController.getAllBooks().size());
    }
}
