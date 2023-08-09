package main;

import library.Book;
import library.User;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J. D. Salinger", "978-0-316-76953-1");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-446-31078-9");

        User user1 = new User("Alice", 1, 5);   //user can borrow upto 5 books
        User user2 = new User("Bob", 2, 3);     //user can borrow upto 3 books

        user1.borrowBook(book1);
        user2.borrowBook(book2);
        user1.borrowBook(book2);

        System.out.println("Books borrowed by Alice: ");
        for (Book book : user1.getBorrowedBooks()) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }
    }
}
