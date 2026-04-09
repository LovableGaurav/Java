package Test2;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();


        myLibrary.addBook(new Book("A001", "Java", "Shuman Shekhar"));
        myLibrary.addBook(new Book("A002", "Machine Learning ", "Bloosam"));
        myLibrary.addBook(new Book("A003", "Nueral Network", "Adarsh Singh"));
        myLibrary.addBook(new Book("A004", "Blockchain", " Sumit  "));
        myLibrary.addBook(new Book("A005", "Fundamental Of Research", " Neeti Mohan "));


        try {
            System.out.println("Initial Library State:");
            myLibrary.displayAvailableBooks();

            System.out.println("\nTesting Actions:");
            myLibrary.issueBook("A002");
            myLibrary.issueBook("A002");

        } catch (LibraryException e) {
            System.err.println(e.getMessage());
        }

        try {
            myLibrary.returnBook("A002");
            myLibrary.returnBook("A999");
        } catch (LibraryException e) {
            System.err.println(e.getMessage());
        }

        myLibrary.displayAvailableBooks();
    }
}