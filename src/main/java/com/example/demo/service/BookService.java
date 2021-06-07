package com.example.demo.service;

import com.example.demo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getBookList();
}
