package com.example.demo.repository;

import com.example.demo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class JpaBookRepositoryTest {


    @Autowired
    JpaBookRepository repository;

    @Autowired
    TestEntityManager testEntityManager;


    @Test
    void Book_저장하기() {

        //given
        Book book = Book.builder()
                .title("TEST TITLE")
                .build();

        //when
        Book persist = testEntityManager.persist(book);
        Book byId = repository.getById(persist.getId());

        //then
        assertEquals(book.getId(), byId.getId(), " ~~~시 ~~~의 Id는 일치해야 합니다.");

    }


}