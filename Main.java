public class Main {

    public static void printBanner() {
        System.out.println("Library Tracker");
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        printBanner();

        Library library = new Library();
        library.addBook(new Book(1, "Java Basics", "John Smith"));
        library.addBook(new Book(2, "Clean Code", "Robert Martin"));
        library.addBook(new Book(3, "Java Basics", "ccc"));
        library.addBook(new Book(4, "Clean Code", "cccc"));
        library.listBooks();
    }
}