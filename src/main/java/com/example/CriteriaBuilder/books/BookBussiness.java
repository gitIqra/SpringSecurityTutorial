package com.example.CriteriaBuilder.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookBussiness {

    @Autowired
    private BookDAO bookDAO;
    public List<Book> getAllBooks() {
        List<Book> bk = bookDAO.getAllBooks();
        return bk;
    }

    public Book getBookById(Long id) {
        Book bk = bookDAO.getBookById(id);
        return bk;
    }

    public Book saveBook(Book book) {
        Book bk = bookDAO.saveBook(book );
        return bk;
    }


    public void deleteByid(Long id) {
        bookDAO.deleteByid(id);
    }
}
