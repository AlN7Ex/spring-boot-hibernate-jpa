package ru.learnup.spring.springboothibernatejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.*;
import ru.learnup.spring.springboothibernatejpa.entity.Product;
import ru.learnup.spring.springboothibernatejpa.service.AuthorService;
import ru.learnup.spring.springboothibernatejpa.service.BookService;
import ru.learnup.spring.springboothibernatejpa.service.ProductService;

@SpringBootApplication
public class SpringBootHibernateJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootHibernateJpaApplication.class);
    static void updateAsync(ProductService service) {

        Product product = service.getProductById(3);
        product.setName("new product");

        for (int i = 0; i < 5; i++) {
            new Thread(() -> service.update(product)).start();
        }
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootHibernateJpaApplication.class, args);
        BookService bookService = context.getBean(BookService.class);
        AuthorService authorService = context.getBean(AuthorService.class);

        ProductService productService = context.getBean(ProductService.class);

//        log.info("Book {} ", authorService.getAuthorById(1));
        log.info("{}", productService.getProductById(3));
//        updateAsync(productService);


//        log.info("All books by author_id {}: {}", 2, bookService.customFindAllBookByAuthorId(2));
    }
}
