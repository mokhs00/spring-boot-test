package com.example.demo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

@Getter @Setter
@RequiredArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;


    @Builder
    public Book(String title) {
        this.title = title;
    }
}
