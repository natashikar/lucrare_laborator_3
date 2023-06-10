package dev.hacker.avesome.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;

import java.time.LocalDate;

@Entity

public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String isbn;
    private String name;
    private LocalDate publicationYear;
    private String editura;
    private long n_page;

    public Book() {
    }

    public Book(String isbn, String name, LocalDate publicationYear, String editura, long n_page) {
        this.isbn = isbn;
        this.name = name;
        this.publicationYear = publicationYear;
        this.editura = editura;
        this.n_page = n_page;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public long getN_page() {
        return n_page;
    }

    public void setN_page(long n_page) {
        this.n_page = n_page;
    }
}
