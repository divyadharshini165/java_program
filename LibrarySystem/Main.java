public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("J.K. Rowling", 7);
        Author author2 = new Author("George Orwell", 6);

        Book book1 = new Book("Harry Potter", author1, 1997);
        Book book2 = new Book("1984", author2, 1949);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        library.searchByTitle("1984");
        library.borrowBook("1984");
        library.returnBook("1984");

        library.searchByAuthor("J.K. Rowling");
    }
}
