package domain;

public class Book {
    private String title;
    private String author;

    public Book() {

    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return "Title: " + this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return "Author: " + this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
