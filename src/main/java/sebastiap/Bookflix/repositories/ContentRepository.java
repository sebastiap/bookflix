package sebastiap.Bookflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sebastiap.Bookflix.model.Content;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContentRepository extends JpaRepository<Content,Integer> {

    public List<Content> findByAuthor(String author);
    public List<Content> findByBook(Integer book);
    public Optional<Content> findByTitle(String title);
}
