package de.workshops.bookshelf.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookSearchRequest {

    private String author;

    private String isbn;
}
