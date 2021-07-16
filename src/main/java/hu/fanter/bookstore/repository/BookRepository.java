package hu.fanter.bookstore.repository;

import hu.fanter.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByIsbn(String isbn);

}

