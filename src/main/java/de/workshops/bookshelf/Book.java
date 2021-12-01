package de.workshops.bookshelf;

import lombok.Data;

@Data
class Book {

    private String title;

    private String description;

    private String author;

    private String isbn;
}
