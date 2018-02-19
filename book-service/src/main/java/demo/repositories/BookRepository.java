package demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.domains.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
