package guru.springframework.spring6webapp.services;

import java.util.List;

import guru.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    List<Author> findAll();

}
