package ru.learnup.spring.springboothibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.learnup.spring.springboothibernatejpa.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select * from book_shop.book b " +
            "join book_shop.author a on b.author_id = a.author_id " +
            "where b.author_id = ?1", nativeQuery = true)
    List<Book> customFindAllBookByAuthorId(Integer id);
}
