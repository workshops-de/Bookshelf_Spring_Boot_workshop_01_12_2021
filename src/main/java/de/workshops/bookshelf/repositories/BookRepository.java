package de.workshops.bookshelf.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.workshops.bookshelf.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {

    private final ObjectMapper mapper;

    private final ResourceLoader resourceLoader;

    private List<Book> books;

    public List<Book> getBooks() throws IOException {
        final var resource = resourceLoader.getResource("classpath:books.json");
        return mapper.readValue(resource.getInputStream(), new TypeReference<>() {});
    }
}
