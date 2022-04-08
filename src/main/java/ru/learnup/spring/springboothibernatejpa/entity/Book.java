package ru.learnup.spring.springboothibernatejpa.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Книга содержит информацию:
 * о названии
 * идентификаторе автора
 * годе издания
 * количестве страниц
 * цене
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "book_shop")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author_id;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private StorageBook storageBook;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;

    @Column(nullable = false)
    private String publish_year;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer price;
}
