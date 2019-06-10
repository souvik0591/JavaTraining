package souvik.spring.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import souvik.spring.springWebApp.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
