package sebastiap.Bookflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sebastiap.Bookflix.model.Book;
import sebastiap.Bookflix.model.Content;
import sebastiap.Bookflix.repositories.BookRepository;
import sebastiap.Bookflix.repositories.ContentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContentService {

    private Integer id;
    private String nombre;
    private String author;
    private String tipo;
    private String themes;
    private Integer age;


    private ContentRepository contRepo;
    public ContentService(ContentRepository contRepo) {
        this.contRepo = contRepo;
    }

    public List<Content> findContent() {
        return contRepo.findAll();
    }
    public Optional<Content> findContentById(Integer id){
        return contRepo.findById(id);
    }

    public List<Content> findContentByAuthor(String author){
        return contRepo.findByAuthor(author);

    }
    public Optional<Content> findContentByTitle(String title){
        return contRepo.findByTitle(title);

    }
    public Content saveContent(Content newContent){
        return contRepo.save(newContent);
    }
}
