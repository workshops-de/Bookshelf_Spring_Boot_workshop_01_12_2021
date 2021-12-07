package de.workshops.bookshelf.repositories;

import de.workshops.bookshelf.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);

    Book findByAuthorAndTitle(String author, String title);

    List<Book> findTop10ByAuthor(String author);
}
