package ru.learnup.spring.springboothibernatejpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.learnup.spring.springboothibernatejpa.entity.Book;
import ru.learnup.spring.springboothibernatejpa.repository.BookRepository;
import ru.learnup.spring.springboothibernatejpa.service.BookService;

import java.util.List;

@Controller
public class BookController {

    BookService bookService;

    @GetMapping("/books")
    public void showAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAllAttributes(books);
    }
}
