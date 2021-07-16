package hu.fanter.bookstore.service;

import hu.fanter.bookstore.domain.Book;
import hu.fanter.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(int id) {
        bookRepository.deleteById(id);
    }

    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }


}
