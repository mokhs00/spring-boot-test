package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JsonTest
public class BookJsonTest {

    @Autowired
    private JacksonTester<Book> json;

    public void json_테스트() throws Exception {
        Book book = Book.builder()
                .title("test title")
                .build();

        String content = "{\"title\":\"test title\"}";

        assertEquals(this.json.parseObject(content).getTitle(), book.getTitle());
    }
}
