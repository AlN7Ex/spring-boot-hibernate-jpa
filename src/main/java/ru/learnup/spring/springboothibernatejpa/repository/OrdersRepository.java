package ru.learnup.spring.springboothibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.spring.springboothibernatejpa.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
