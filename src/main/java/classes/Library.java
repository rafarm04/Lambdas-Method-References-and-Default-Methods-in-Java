package src.main.java.classes;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library implements BookManager {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                    .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
    }

    @Override
    public List<Book> sortBooksByTitle() {
        return books.stream()
                    .sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                    .collect(Collectors.toList());
    }
}
