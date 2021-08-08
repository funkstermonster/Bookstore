package hu.fanter.bookstore.controller;

import hu.fanter.bookstore.domain.Book;
import hu.fanter.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookRestController {

    private final BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
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

    @DeleteMapping("/delete/{id}")
    private void deleteBook(@PathVariable() int id) {
        bookService.deleteById(id);
    }

    @GetMapping("/book/evenisbn")
    private List<Book> findEvenIsbn() {
        return bookService.evenIsbnBooks();
    }

}
