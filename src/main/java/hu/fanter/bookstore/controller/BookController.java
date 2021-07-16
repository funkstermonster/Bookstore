package hu.fanter.bookstore.controller;

import hu.fanter.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    @Autowired
    private BookService service;

    @RequestMapping("/book-list")
    public String bookList(Model model) {
        model.addAttribute("books", service.findAll());

        return "book-list";
    }
}
