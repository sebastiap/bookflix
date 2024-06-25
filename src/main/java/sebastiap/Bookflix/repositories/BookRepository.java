package sebastiap.Bookflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sebastiap.Bookflix.model.Book;
import sebastiap.Bookflix.model.Content;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    public Optional<Book> findByTitle(String Title);

    //public Optional<Content> findById(Integer id);

}
