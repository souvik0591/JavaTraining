package souvik.spring.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import souvik.spring.springWebApp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
