
package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Component
@Transactional
@RequiredArgsConstructor
public class BookHelper implements CommandLineRunner{
private final BookRepo bookRepo;

@Override
public void run(String... args) throws Exception {
    Long bookSize = bookRepo.count();
    if(bookSize == 0){
        Book book = new Book();
        bookRepo.saveAndFlush(book);
    }
}
}
