package app;
import src.main.java.classes.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Agregamos algunos libros
        library.addBook(new Book("Cien Años de Soledad", "Gabriel García Márquez", 1967));
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("Animal Farm", "George Orwell", 1945));
        library.addBook(new Book("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 1985));
        library.addBook(new Book("Brave New World", "Aldous Huxley", 1932));

        System.out.println("📚 Todos los libros:");
        library.printAllBooks();

        System.out.println("\n🔍 Libros por George Orwell:");
        library.findBooksByAuthor("George Orwell").forEach(System.out::println);

        System.out.println("\n📖 Libros ordenados por título:");
        library.sortBooksByTitle().forEach(System.out::println);
    }
}
