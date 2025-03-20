public class Q07 {
    public static void main(String[] args) {

        Library library = new Library(5);

        library.addBook(new PrintedBook("Enid blyton", "Five on a Treasure Island", 1942, 180));
        library.addBook(new EBook("George Orwell", "1984", 1949, 1.5, "PDF"));
        library.addBook(new AudioBook("Michelle Obama", "Becoming", 2018, 19.5, "Michelle Obama"));

        library.displayBooks();
    }
}
