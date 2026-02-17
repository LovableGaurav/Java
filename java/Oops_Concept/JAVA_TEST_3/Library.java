package JAVA_TEST_3;

import java.util.HashMap;

public class Library { // Removed 'extends Books' - a Library contains books, it isn't one.

    private final HashMap<String, Book> books = new HashMap<>();
    private int totalBooksCount = 0;

    // No-arg constructor to match your main method call: new Library()
    public Library() {
    }

    public void addBook(Book book) {
        // Use getters, not setters, to retrieve data
        books.put(book.getIsbn(), book);
        if (book.isAvailable()) {
            totalBooksCount++;
        }
    }

    public void borrowBook(String isbn) throws BookNotFoundException {
        if (!books.containsKey(isbn)) {
            throw new BookNotFoundException("ISBN " + isbn + " not found.");
        }

        Book book = books.get(isbn);
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book '" + book.getTitle() + "' is already borrowed.");
        }

        book.setAvailable(false);
        totalBooksCount--;
        System.out.println("Success! Borrowed: " + book.getTitle());
    }

    public int getTotalBooksCount() {
        return totalBooksCount;
    }

    // Java 25+ allows simpler main methods, but let's stick to standard for now
    public static void main(String[] args) {
        Library myLibrary = new Library();

        // Ensure your Book class has a constructor matching: Book(String, String, boolean)
        Book b1 = new Book("ISBN123", "Java Basics", true);
        Book b2 = new Book("ISBN456", "Data Structures", false);

        myLibrary.addBook(b1);
        myLibrary.addBook(b2);

        System.out.println("Count: " + myLibrary.getTotalBooksCount());
        // ... rest of your try-catch logic
    }
}