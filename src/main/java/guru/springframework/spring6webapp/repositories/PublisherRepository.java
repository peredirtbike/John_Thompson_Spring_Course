package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    // This interface will automatically inherit methods for CRUD operations
    // from CrudRepository, such as save, findById, findAll, deleteById, etc.

}
