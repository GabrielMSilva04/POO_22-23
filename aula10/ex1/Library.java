package aula10.ex1;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    HashMap<String, Book> bookByGenre;

    public Library() {
        this.bookByGenre = new HashMap<String, Book>();
    }

    public void addBook(Book book, String genre) {
        bookByGenre.put(genre, book);
    }

    public void removeBook(String genre) {
        bookByGenre.remove(genre);
    }

    public Book getBook(String genre) {
        return bookByGenre.get(genre);
    }

    public ArrayList<String> getGenres() {
        return new ArrayList<String>(bookByGenre.keySet());
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<Book>(bookByGenre.values());
    }

    public String toString() {
        String str = "";
        for (String genre : bookByGenre.keySet()) {
            str += "Genre: " + genre + "\n" + bookByGenre.get(genre) + "\n" + "\n";
        }
        return str;
    }
}