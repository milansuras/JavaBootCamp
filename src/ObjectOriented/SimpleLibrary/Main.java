package ObjectOriented.SimpleLibrary;

public class Main {
    public static void main(String[] args) {
        // Test the classes
        Library library = new Library();

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0", 200);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", 281);
        Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4", 328);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display details of all books in the library
        library.displayAllBooks();
    }
}




