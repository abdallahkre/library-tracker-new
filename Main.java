public class Main {

    public static void printBanner() {
        System.out.println("Library Tracker");
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        printBanner();

        Library library = new Library();
        library.listBooks();
    }
}