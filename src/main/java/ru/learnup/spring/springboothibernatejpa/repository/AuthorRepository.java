package ru.learnup.spring.springboothibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learnup.spring.springboothibernatejpa.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
