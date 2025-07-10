package org.example.basic;

public class Book {
    private String bookName;
    private String bootAuthor;

    public Book(String bookName, String bootAuthor) {
        this.bookName = bookName;
        this.bootAuthor = bootAuthor;
    }

    public static Book getBookObject(){
        return new Book("Java", "James Gosling");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bootAuthor='" + bootAuthor + '\'' +
                '}';
    }
}
