package JAVA_TEST_3;

public class Book {
    private String isbn;
   private String title;
    private boolean isAvailable;

    public Book(String isbn, String title, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.isAvailable = isAvailable;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
