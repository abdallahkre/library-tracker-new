import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    //تعلييق 


    public void listBooks() {
        if (books.isEmpty()) {
        System.out.println("The library is empty.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    public void searchByTitle(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found.");
        }
    }

    // تعلييق 
    
    public void removeBook(int id) {
        boolean removed = books.removeIf(book -> book.getId() == id);
        if (removed) {
            System.out.println("Book removed.");
        } else {
            System.out.println("Book not found.");
        }
    }
}