/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
 /*   public String getGreeting() {
        return "Hello World!";
    }
  */  

    public static void main(String[] args) {
        Library library = new Library();
        

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("Twisted Hate", "Ana Huang", 2021);
        library.addBook(book1);
        library.addBook(book2);

        // Register patrons
        Patron patron1 = new Patron("Jocemba");
        Patron patron2 = new Patron("Daryl");
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Lend and return books
        library.lendBook(book1, patron1);
        library.lendBook(book2, patron2);
        library.returnBook(book1, patron1);
      
      // List available books
        System.out.println("Available books:");
        for (Book book : library.listAvailableBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

    }
}
