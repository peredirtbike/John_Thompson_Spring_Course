package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    // Additional query methods can be defined here if needed

}
