package lesson04_oct18.lib;

public class LibraryApp {
    public static void main(String[] args) {
        Author author = new Author("John");
        author.setName("Big John");



        Book book1 = new Book("Java", 400, author);
        Book book2 = new Book("Scala", 800, author);
        Book book3 = new Book("Python", 800, author);

        Shelf shelf = new Shelf(1, 2, 3, 30);
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        String author_name = shelf.books[0].author.getName();

        shelf.contains("Scala");
        shelf.contains("Php");
    }
}
