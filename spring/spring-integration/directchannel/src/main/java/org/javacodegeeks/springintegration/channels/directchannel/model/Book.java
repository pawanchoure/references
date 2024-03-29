package org.javacodegeeks.springintegration.channels.directchannel.model;

public class Book {

    public enum Genre {
        fantasy,
        horror,
        romance,
        thriller
    }

    private long bookId;
    private String title;
    private Genre  genre;

    public Book() {}

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return String.format("Book %s, Genre: %s.", title, genre);
    }
}
