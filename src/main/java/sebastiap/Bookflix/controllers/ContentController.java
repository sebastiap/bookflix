package sebastiap.Bookflix.controllers;

import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sebastiap.Bookflix.model.Book;
import sebastiap.Bookflix.model.Content;
import sebastiap.Bookflix.services.ContentService;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/api/v1/content")
public class ContentController {

    record contentRequest(
            Integer id,
            String title,
            String author,
            Integer type,
            String themes,
            Integer age,
            Integer book
    ){

    };

    private Content setContent(Content content, contentRequest request){
        content.setId(request.id);
        content.setTitle(request.title);
        content.setAuthor(request.author);
        content.setType(request.type);
        content.setThemes(request.themes);
        content.setAge(request.age);
        content.setBook(request.book);

        return content;
    }
    @Autowired
    private ContentService contServ;
    @GetMapping("/")
    public List<Content> getAllContent(){
        return contServ.findContent();
    }

    @GetMapping("/{id}")
    public Optional<Content> getBookContent(@PathVariable Integer id){
        return contServ.findContentById(id);
    }
    @GetMapping("/author/{author}")
    public List<Content> getBookContentByAuthor(@PathVariable String author){
        return contServ.findContentByAuthor(author);
    };

    //OJO con este cuando un cuento este en mas de un libro
    @GetMapping("/title/{title}")
    public Optional<Content> getBookContentByTitle(@PathVariable String title){
        return contServ.findContentByTitle(title);
    }

    @PostMapping("/create")
    public ResponseEntity<Content> createContent(@RequestBody contentRequest request) {
        Content newContent = new Content();
        setContent(newContent,request);
        return new ResponseEntity<Content>(contServ.saveContent(newContent), HttpStatus.OK);
    }

}
