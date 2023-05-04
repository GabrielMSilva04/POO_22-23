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

        books.get("Drama").add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943));
        books.get("Comedy").add(new Book("The Hobbit", "J. R. R. Tolkien", 1937));
        books.get("Action").add(new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954));

        books.get("Drama").add(new Book("Ben-Hur: A Tale of the Christ", "Lew Wallace", 1880));
        books.get("Comedy").add(new Book("The Da Vinci Code", "Dan Brown", 2003));
        books.get("Action").add(new Book("O Alquimista", "Paulo Coelho", 1988));

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