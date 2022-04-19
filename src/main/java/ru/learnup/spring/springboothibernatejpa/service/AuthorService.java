package ru.learnup.spring.springboothibernatejpa.service;

import org.springframework.stereotype.Service;
import ru.learnup.spring.springboothibernatejpa.entity.Author;
import ru.learnup.spring.springboothibernatejpa.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository authorRepository) {
        this.repository = authorRepository;
    }

    public Author newAuthor(Author author) {
        return repository.save(author);
    }

    public List<Author> getAuthors() {
        return repository.findAll();
    }

    public Author getAuthorById(Integer id) {
        return repository.getById(id);
    }
}
