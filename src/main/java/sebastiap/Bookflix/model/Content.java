package sebastiap.Bookflix.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "Content")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Content {

    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TYPE")
    private Integer type;
    @Column(name = "THEMES")
    private String themes;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "BOOK_ID")
    private Integer book;




}
