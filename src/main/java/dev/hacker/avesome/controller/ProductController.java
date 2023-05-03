package dev.hacker.avesome.controller;

import dev.hacker.avesome.model.Book;
import dev.hacker.avesome.model.Product;
import dev.hacker.avesome.repository.BookRepository;
import dev.hacker.avesome.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("products")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @PostMapping("products")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

}
