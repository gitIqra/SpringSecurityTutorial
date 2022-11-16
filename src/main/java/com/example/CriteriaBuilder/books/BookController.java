package com.example.CriteriaBuilder.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        List<Book> bk = bookService.getAllBooks();
        return bk;
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id){
        Book bk = bookService.geBookById(id);
        return bk;
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        Book bk = bookService.saveBook(book);
        return bk;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        bookService.deleteById(id);
    }


}
