package test;

import domain.Book;

public class TestBook {
    static Book PP = new Book();
    static Book H = new Book();
    static Book WP = new Book();

    static void main(String[] args) {
        PP.setTitle("Pride and Prejudice");
        PP.setAuthor("Jane Austen");
        H.setTitle("Hamlet");
        H.setAuthor("William Shakespeare");
        WP.setTitle("War and Peace");
        WP.setAuthor("Leo Tolstoy");
    }
}
