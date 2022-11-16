package com.example.CriteriaBuilder.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    @Autowired
    private BookBussiness bookBussiness;
    public List<Book> getAllBooks() {
        List<Book> bk = bookBussiness.getAllBooks();
        return bk;
    }

    public Book geBookById(Long id) {
        Book bk = bookBussiness.getBookById(id);
        return bk;
    }

    public Book saveBook(Book book) {
        Book bk = bookBussiness.saveBook(book);
        return bk;
    }

    public void deleteById(Long id) {
        bookBussiness.deleteByid(id);
    }
}
