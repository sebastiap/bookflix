package sebastiap.Bookflix.services;

import org.springframework.stereotype.Service;
import sebastiap.Bookflix.model.Book;
import sebastiap.Bookflix.repositories.BookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    //private List<Book> movies = new ArrayList<Book>();
    private BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }
    public Optional<Book> titleSearch(String Title) {
        return repo.findByTitle(Title);
    }
    public List<Book> allBooks(){

        List<Book> algo = repo.findAll();
        System.out.println(algo);
        return repo.findAll();



        /*


            Book libro = new Book
            ("Cuentos de la Selva",
                    "Horacio Quiroga",
                    "algo",


                    Arrays.asList("Las medias de los flamencos", "La abeja haragana", "La tortuga gigante",
                            "El loro pelado", "La guerra de los Yacarés", "La gama ciega", "Historia de dos cachorros de coati y de dos cachorros de hombre", "El paso de Yabebiri"),
        "Kapeluz/Norma",
                Arrays.asList("Golu"),
        Arrays.asList(""),
        Arrays.asList(""));
        movies.add(libro);

            return movies;

         */


    }

    public Optional<Book> findByTitle(String Title){
        return repo.findByTitle(Title);
    }

    public Optional<Book> findById(Integer id){
        return repo.findById(id);
    }

    public Book saveBook(Book newBook){
        return repo.save(newBook);
    }
    public void deleteBook(Integer id){
        repo.deleteById(id);
    }

    public Book updateBook(Integer id,Book updatedBook) {
        System.out.println("Che, algo hice aca");
        Optional<Book> oldBook = repo.findById(id);
        if (oldBook.isPresent()) {
            repo.save(updatedBook);
        }
    System.out.println("Che, algo hice aca");
        return updatedBook;
}
/*
    public Optional<Book> findByTitle(String title){
        return movies.stream().filter(B -> B.getTitle().equals(title)).findFirst();
    }
    */
}
