package org.example;

import java.util.ArrayList;
import java.util.List;


public class Patron {
    private String name;
    private List<Book> borrowedBooks;


    public Patron(String name){
       this.name = name;
       this.borrowedBooks = new ArrayList<>();
    }
    
    public String getName(){
       return name;    
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        System.out.println(name + " borrowed the book: " + book.getTitle());
    }


    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println(name + " doesn't have the book: " + book.getTitle());
        }
    }

    // List borrowed books
    public List<Book> listBorrowedBooks() {
        return borrowedBooks;
    }

}
