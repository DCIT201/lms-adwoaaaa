package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

 public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    // Register a patron
    public void registerPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron registered: " + patron.getName());
    }

    // Lend a book to a patron
    public void lendBook(Book book, Patron patron) {
        if (books.contains(book)) {
            books.remove(book);
            patron.borrowBook(book);
            System.out.println("Book lent: " + book.getTitle() + " to " + patron.getName());
        } else {
            System.out.println("Book is not available: " + book.getTitle());
        }
    }

    // Accept a returned book from a patron
    public void returnBook(Book book, Patron patron) {
        patron.returnBook(book);
        books.add(book);
        System.out.println("Book returned to library: " + book.getTitle());
    }

    // List all available books
    public List<Book> listAvailableBooks() {
        return books;
    }
    
}
