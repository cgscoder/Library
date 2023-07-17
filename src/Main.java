public class Main {
    public static void main(String[] args) {
        // Create library catalog
        Library library = new Library();

        // Add books to the catalog
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Search by title
        library.searchByTitle("1984");

        // Search by author
        library.searchByAuthor("J.K. Rowling");

        // Display available books
        library.displayAvailableBooks();
    }
}

