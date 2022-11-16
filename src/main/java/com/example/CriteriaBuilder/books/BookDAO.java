package com.example.CriteriaBuilder.books;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookDAO {

    @Autowired
    private SessionFactory sessionFactory;
    public List<Book> getAllBooks() {
        Criteria criteria = sessionFactory.openSession().createCriteria(Book.class);
        List<Book> bk = criteria.list();
        return bk;
    }

    public Book getBookById(Long id) {
        Criteria criteria = sessionFactory.openSession().createCriteria(Book.class);
        criteria.add(Restrictions.eq("id", id));
        criteria.setMaxResults(1);
        return (Book) criteria.uniqueResult();

    }

    public Book saveBook(Book book ) {
        sessionFactory.openSession().saveOrUpdate(book);
        return book;
    }


    public void deleteByid(Long id) {
        sessionFactory.openSession().delete(id);
    }
}
