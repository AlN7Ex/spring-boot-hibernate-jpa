package ru.learnup.spring.springboothibernatejpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.learnup.spring.springboothibernatejpa.entity.Book;
import ru.learnup.spring.springboothibernatejpa.repository.BookRepository;
import ru.learnup.spring.springboothibernatejpa.service.BookService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/books")
    public String showAllBooks(Model model) {

        model.addAttribute("books", bookService.getAllBooks());

        return "books";
    }
}
