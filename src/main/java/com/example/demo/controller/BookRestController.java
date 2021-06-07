package com.example.demo.controller;

import com.example.demo.Book;
import com.example.demo.service.BookRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @Autowired
    private BookRestService bookRestService;

    @GetMapping(path = "/rest/test",produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getRestBooks() {
        return this.bookRestService.getRestBook();
    }


}
