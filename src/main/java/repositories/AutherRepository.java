package repositories;

import domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AutherRepository extends CrudRepository<Author,Long> {
}
