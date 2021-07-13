package hu.fanter.bookstore.controller;

import hu.fanter.bookstore.domain.Book;
import hu.fanter.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/{isbn}")
    private Book findBookByIsbn(@PathVariable() String isbn) {
        return bookService.findByIsbn(isbn);
    }

    @PostMapping("/save")
    private Book saveBook(@RequestBody() Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/delete/{isbn}")
    private void deleteBook(@PathVariable() String isbn) {
        bookService.deleteByIsbn(isbn);
    }

}
