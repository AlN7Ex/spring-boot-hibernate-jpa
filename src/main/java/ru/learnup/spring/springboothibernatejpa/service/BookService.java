package ru.learnup.spring.springboothibernatejpa.service;

import org.springframework.stereotype.Service;
import ru.learnup.spring.springboothibernatejpa.entity.Book;
import ru.learnup.spring.springboothibernatejpa.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> customFindAllBookByAuthorId(Integer id) {
        return bookRepository.customFindAllBookByAuthorId(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getBooks();
    }
}
