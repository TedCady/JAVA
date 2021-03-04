package com.cady.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.mvc.models.Book;
import com.cady.mvc.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    public Book updateBook(Long id, String title, String desc, String lang, int numOfPages) {
        Book b = findBook(id);
        if (title.length() >= 5 && title.length() <= 200) {
            b.setTitle(title);
        }
        if (desc.length() >= 5 && desc.length() <= 200) {
            b.setDescription(desc);
        }
        if (lang.length() >= 3 && lang.length() <= 40) {
            b.setLanguage(lang);
        }
        if (numOfPages >= 100) {
            b.setNumberOfPages(numOfPages);
        }
        return bookRepository.save(b);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}