package com.sangvaleap.lab2mvc.service;

import com.sangvaleap.lab2mvc.domain.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
   private final List<Book> books = Arrays.asList(
            new Book(1, "Book A", "1111-1111", "Mr. A"),
            new Book(2, "Book B", "2222-2222", "Mr. B"),
            new Book(3, "Book C", "3333-3333", "Mr. C")
    );
    public List<Book> getBooks(){
       return books;
    }

    public Book getBookById(int id){
        return books.stream().filter(b-> b.getId() == id).findFirst().orElse(null);
    }
}
