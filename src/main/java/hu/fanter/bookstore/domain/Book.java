package hu.fanter.bookstore.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book {

    @Id
    private String isbn;
    private String title;
    private String author;


}
