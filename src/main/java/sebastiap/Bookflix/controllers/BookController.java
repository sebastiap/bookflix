package sebastiap.Bookflix.controllers;

import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sebastiap.Bookflix.services.BookService;

import sebastiap.Bookflix.model.Book;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    record bookRequest(
            Integer id,
            String title,
            String author,
            Integer type,
            Integer tales,
            String editorial,
            Integer colections,
            Integer genres,
            Integer themes,
            String location
    ){

    }

    private Book setBook(Book book,bookRequest request){
        book.setId(request.id);
        book.setTitle(request.title);
        book.setAuthor(request.author);
        book.setEditorial(request.editorial);
        book.setGenres(request.genres);
        book.setColections(request.colections);
        book.setThemes(request.themes);
        book.setLocation(request.location);
        return book;
    }

    @GetMapping(path = {"","/","/api/v1","/api/v1/"})
    public ResponseEntity<List<Book>> allBooks() {
        return new ResponseEntity<List<Book>>( bookService.allBooks(), HttpStatus.OK);
    }


    @GetMapping("/api/v1/title/{title}")
    public ResponseEntity<Optional<Book>> bookByTitle(@PathVariable String title) {
        System.out.println(title);
        return new ResponseEntity<Optional<Book>>(bookService.findByTitle(title), HttpStatus.OK);
    }


    @GetMapping("/api/v1/id/{id}")
    public ResponseEntity<Optional<Book>> bookByTitle(@PathVariable Integer id) {
        System.out.println(id);
        return new ResponseEntity<Optional<Book>>(bookService.findById(id), HttpStatus.OK);
    }
    @PostMapping(path = {"/api/v1/create","/api/v1/create/"})
    public ResponseEntity<Book> insertBook(@RequestBody bookRequest request){
        Book newBook = new Book();
        setBook(newBook,request);
        return new ResponseEntity<Book>(bookService.saveBook(newBook), HttpStatus.OK);
    }

    @DeleteMapping("/api/v1/delete/{id}")
    public ResponseEntity<Integer> deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
        ResponseEntity response = new ResponseEntity<>(HttpStatus.OK);
        return response;

    }

    @PutMapping("/api/v1/update/{id}")
    public ResponseEntity<Integer> updateBook(@PathVariable Integer id,@RequestBody bookRequest request){
        Book updatedBook = new Book();
        setBook(updatedBook,request);
        bookService.updateBook(4,updatedBook);
        System.out.println("Che, algo hice aca ${id}" + id);
        if (id.equals(null) || id.describeConstable().isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ResponseEntity response = new ResponseEntity<>(HttpStatus.OK);
        return response;

    }

}
