import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void listBooks() {
        if (books.isEmpty()) {
        System.out.println("The library is empty.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}