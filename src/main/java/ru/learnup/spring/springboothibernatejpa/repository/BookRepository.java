package ru.learnup.spring.springboothibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.spring.springboothibernatejpa.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
