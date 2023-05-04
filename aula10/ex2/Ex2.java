package aula10.ex2;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Ex2 {

    public static void main(String[] args) {
        Map<String, HashSet<Book>> books = new TreeMap<>();
        books.put("Drama", new HashSet<>());
        books.put("Comedy", new HashSet<>());
        books.put("Action", new HashSet<>());

        books.get("Drama").add(new Book("A Song of Ice and Fire", "George R. R. Martin", 1996));
        books.get("Comedy").add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979));
        books.get("Action").add(new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954));

        books.get("Drama").add(new Book("1984", "George Orwel", 1949));
        books.get("Comedy").add(new Book("Don Quichote", "Miguel de Cervantes", 1605));
        books.get("Action").add(new Book("The Count of Monte Cristo", "Alexandre Dumas", 1844));

        System.out.println(books.entrySet());
        System.out.println();
        System.out.println(books.keySet());
        System.out.println();
        System.out.println(books.values());
        System.out.println();

        System.out.println(getRandomBook(books, "Drama"));
        System.out.println();
        System.out.println(getRandomBook(books, "Comedy"));
        System.out.println();
        System.out.println(getRandomBook(books, "Action"));

    }

    public static Book getRandomBook(Map<String, HashSet<Book>> list, String genre) {
        HashSet<Book> books = list.get(genre);
        int random = (int) (Math.random() * books.size());

        int i = 0;
        for (Book book : books) {
            if (i == random) {
                return book;
            }
            i++;
        }
        return new Book("empty", "empty", 0);
    }
}