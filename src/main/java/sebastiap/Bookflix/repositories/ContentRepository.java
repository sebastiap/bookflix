package sebastiap.Bookflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sebastiap.Bookflix.model.Content;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContentRepository extends JpaRepository<Content,Integer> {

    public List<Content> findByAuthor(String author);

    public Optional<Content> findByTitle(String title);
}
