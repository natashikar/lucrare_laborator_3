package dev.hacker.avesome.controller;

import dev.hacker.avesome.model.Book;
import dev.hacker.avesome.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("books")
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @PostMapping("books")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

}
