package ru.learnup.spring.springboothibernatejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.*;


@SpringBootApplication
public class SpringBootHibernateJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootHibernateJpaApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootHibernateJpaApplication.class, args);

    }
}
