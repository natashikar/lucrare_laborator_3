package dev.hacker.avesome.controller;

import dev.hacker.avesome.model.Book;
import dev.hacker.avesome.repository.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
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

    @PostConstruct
    private void init(){
        bookRepository.saveAll(List.of(new Book("9789664668320","Enciclopedie in intrebari si raspunsuri", LocalDate.parse("2000-07-10"),"Pegas",100),
                new Book("String isbn","String name", LocalDate.now(),"String editura",200),
                new Book("String isbn","String name", LocalDate.now(),"String editura",300),
                new Book("String isbn","String name", LocalDate.now(),"String editura",400),
                new Book("String isbn","String name", LocalDate.now(),"String editura",500)));
    }
}
