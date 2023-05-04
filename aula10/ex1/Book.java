package aula10.ex1;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year;
    }
}
