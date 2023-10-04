package com.sangvaleap.lab2mvc.controller;

import com.sangvaleap.lab2mvc.domain.Book;
import com.sangvaleap.lab2mvc.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = {"/books"})
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
       this.bookService = bookService;
    }

    @GetMapping(value = {""})
    public String getBooks( Model model){
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping(value = {"/{id}"})
    public String getBookById(@PathVariable int id, Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "book";
    }

}
