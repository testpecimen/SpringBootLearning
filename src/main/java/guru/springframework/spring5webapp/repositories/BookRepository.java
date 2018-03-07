package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Diego Junco on 06/03/2018
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
