package eksamen10;


import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooksByAuthor(String author) {
        ArrayList<Book> authors = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                authors.add(b);
            }
        }
        return authors;
    }

    @Override
    public String toString() {
        return "Bibliotek: " + address;
    }
}
