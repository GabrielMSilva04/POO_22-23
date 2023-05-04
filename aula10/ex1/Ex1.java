package aula10.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Book b1 = new Book("a", "x", 2000);
        Book b2 = new Book("b", "y", 2001);
        Book b3 = new Book("c", "z", 2002);
        Book b4 = new Book("d", "w", 2003);
        Book b5 = new Book("e", "v", 2004);

        Library lib = new Library();
        lib.addBook(b1, "genre1");
        lib.addBook(b2, "genre2");
        lib.addBook(b3, "genre3");
        lib.addBook(b4, "genre4");
        lib.addBook(b5, "genre5");

        System.out.println(lib);
        
        System.out.println("Genres:");
        for (String genre : lib.getGenres()) {
            System.out.println(genre);
        }
        System.out.println();
        
        System.out.println("Books:");
        for (Book book : lib.getBooks()) {
            System.out.println(book);
            System.out.println();
        }
    }
    
}
