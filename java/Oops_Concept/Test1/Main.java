import Test1.Book;
import Test1.Library;
import Test1.StudentMember;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();


        myLibrary.addBook(new Book("B001", "Effective Java", "Joshua Bloch"));
        myLibrary.addBook(new Book("B002", "Clean Code", "Robert Martin"));
        myLibrary.addBook(new Book("B003", "Java Design Patterns", "Erich Gamma"));

        StudentMember student = new StudentMember("S101", "Alice");

        myLibrary.displayBooks();

        System.out.println("\nAction: Issuing B001 to S101...");
        myLibrary.issueBook(student.getMemberId(), "B001");

        myLibrary.search("Clean Code");

        myLibrary.displayBooks();

        System.out.println("\nAction: Returning B001...");
        myLibrary.returnBook("S101", "B001");

        myLibrary.displayBooks();
    }
}