package library;

public class User {
    private String name;
    private int ID;
    private Book[] borrowedBooks;
    private int borrowedCount;

    public User(String name, int ID, int maxBooks) {
        this.name = name;
        this.ID = ID;
        this.borrowedBooks = new Book[maxBooks];
        this.borrowedCount = 0;
    }

    //getter and setter

    public Book[] getBorrowedBooks() {
        Book[] result = new Book[borrowedCount];
        System.arraycopy(borrowedBooks, 0, result, 0, borrowedCount);
        return result;
    }

    public boolean borrowBook(Book book) {
        if (borrowedCount < borrowedBooks.length && book.isAvailable()) {
            borrowedBooks[borrowedCount++] = book;
            book.setAvailable(false);   //book is no longer available
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        for (int i=0; i<borrowedCount; i++) {
            if(borrowedBooks[i] == book) {
                borrowedBooks[i] = borrowedBooks[--borrowedCount];  //here we are swapping the book to be returned with the last book in the array
                borrowedBooks[borrowedCount] = null;    //and then setting the last book to null
                book.setAvailable(true);    //book is now available
                return true;
            }
        }
        return false;
    }
}
