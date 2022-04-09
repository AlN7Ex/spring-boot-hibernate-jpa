package ru.learnup.spring.springboothibernatejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.*;
import ru.learnup.spring.springboothibernatejpa.service.BookService;

@SpringBootApplication
public class SpringBootHibernateJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootHibernateJpaApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootHibernateJpaApplication.class, args);
        BookService bookService = context.getBean(BookService.class);

        log.info("All books by author_id {}: {}", 2, bookService.customFindAllBookByAuthorId(2));
    }
}
