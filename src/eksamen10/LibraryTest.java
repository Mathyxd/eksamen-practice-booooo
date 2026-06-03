package eksamen10;

import java.util.ArrayList;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library("adresse123");
        library.addBook(new Book("gedemælk", "farmermand"));
        library.addBook(new Book("rayquaza sucks", "Deoxys"));
        library.addBook(new Book("kyogre sucks", "groudon"));
        library.addBook(new Book("groudon sucks", "kyogre"));


        System.out.println(library);

        ArrayList<Book> bøger = library.getBooksByAuthor("groudon");
        for (Book b : bøger) {
            System.out.println(b);
        }
    }
}
