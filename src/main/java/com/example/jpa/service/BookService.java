package com.example.jpa.service;

import com.example.jpa.entity.Book;
import com.example.jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
         return bookRepository.findAll();
    }
}
