package hu.fanter.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private String isbn;
    private String tile;
    private String author;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTile() {
        return tile;
    }

    public String getAuthor() {
        return author;
    }
}
