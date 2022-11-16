package com.example.CriteriaBuilder.books;

import javax.persistence.*;

@Entity
@Table(name = "Books_INFO")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;
    private String bookAuthor;
    private double price;

    public Book() {
    }

    public Book(Long id, String bookName, String bookAuthor, double price) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
