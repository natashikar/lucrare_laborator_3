package dev.hacker.avesome.repository;

import dev.hacker.avesome.model.Book;
import dev.hacker.avesome.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
