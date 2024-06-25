package sebastiap.Bookflix.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "Book")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @Basic(optional = false)
    //@SequenceGenerator(name="book_id",sequenceName = "book_id")
   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
    @Column(name = "ID",unique=true, nullable = false)
    private Integer id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "author")
    private String author;
    //private Integer type;
    //@Column(name = "CONTENT")
    //private Integer contentId;
    private String editorial;
    private Integer colections;
    private Integer genres;
    private Integer themes;
    private String location;

/*
El libro se considera de un todo su contenido es de un tipo
Novela
Cuentos
Guion
Poesia
Discurso
Otro
Mas de un tipo de contenido ?
Mix ?

CREATE TABLE COLECTION (
            ID INT PRIMARY KEY     NOT NULL,
            TITLE           TEXT    NOT NULL,
            DESCRIPTION           TEXT    NOT NULL
);

    CREATE TABLE CONTENT_TYPE(
            ID INT PRIMARY KEY     NOT NULL, NAME TEXT NOT NULL,DESCRIPTION TEXT
);

INSERT INTO CONTENT_TYPE VALUES (1,'Novela','Relato largo separado en capitulos.');
INSERT INTO CONTENT_TYPE VALUES (2,'Cuentos','Relato corto.');
INSERT INTO CONTENT_TYPE VALUES (3,'Guion','Descripcion accion por accion de una obra teatral o pelicula.');
INSERT INTO CONTENT_TYPE VALUES (4,'Poesia','Ensayo con rima.');
INSERT INTO CONTENT_TYPE VALUES (5,'Discurso','Ensayo con el objetivo de enseñar algo.');
INSERT INTO CONTENT_TYPE VALUES (6,'Otro','Otro tipo de lectura.');

    CREATE TABLE BOOK(
            ID INT PRIMARY KEY     NOT NULL,
            TITLE           TEXT    NOT NULL,
            AUTHOR           TEXT    NOT NULL,
            EDITORIAL          TEXT   ,
            COLECTIONS            INT references COLECTION(ID),
            GENRES            INT ,
            THEMES            INT,
            LOCATION TEXT
);

INSERT INTO BOOK VALUES (1,'Cuentos de la Selva','Horacio Quiroga',1,'Kapeluz/Norma',1,NULL,1,'CASA');
INSERT INTO BOOK VALUES (2,'Cuentos de Ultratumba','Edgar Allan Poe',1,1,NULL,1,1);
INSERT INTO BOOK VALUES (3,'Cuentos de miedo para asustarse de veras','Varios',1,1,NULL,1,1);

    CREATE TABLE CONTENT(
            ID INT PRIMARY KEY     NOT NULL,
            TITLE           TEXT    NOT NULL,
            AUTHOR           TEXT    NOT NULL,
            TYPE              INT references CONTENT_TYPE(ID),
            THEMES            TEXT,
            AGE            INT,
            BOOK_ID INT references CONTENT_TYPE(ID)
);

INSERT INTO CONTENT VALUES (1,'Las medias de los flamencos','Horacio Quiroga',2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (2,'La abeja haragana','Horacio Quiroga',2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (3,'La tortuga gigante','Horacio Quiroga', 2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (4,'El loro pelado','Horacio Quiroga', 2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (5,'La guerra de los Yacarés','Horacio Quiroga', 2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (6,'La gama ciega','Horacio Quiroga', 2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (7,'Historia de dos cachorros de coati y de dos cachorros de hombre','Horacio Quiroga', 2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (8,'El paso de Yabebiri','Horacio Quiroga', 2,'Aventura',9,1);
INSERT INTO CONTENT VALUES (9,'La calavera','Patricia Suarez', 2,'Terror',9,3);
INSERT INTO CONTENT VALUES (10,'Sensaciones Horribles','Ricardo Mariño', 2,'Terror',9,3);
INSERT INTO CONTENT VALUES (11,'La mujer del moñito','Angela Sommer-Bodengburg', 2,'Terror',9,3);
INSERT INTO CONTENT VALUES (12,'Barbara','María Teresa Andruetto', 2,'Terror',9,3);
INSERT INTO CONTENT VALUES (13,'Flores contra la muerte','Ana Maria Shua', 2,'Terror',9,3);
INSERT INTO CONTENT VALUES (14,'Gato','Laura No', 2,'Terror',9,3);





FALTARIA MUCHOS A MUCHOS

    CREATE TABLE BOOK(
            ID INT PRIMARY KEY     NOT NULL,
            TITLE           TEXT    NOT NULL,
            AUTHOR           TEXT    NOT NULL,
            EDITORIAL          TEXT   ,
            COLECTIONS            INT,
            GENRES            INT ,
            THEMES            INT,
            LOCATION TEXT
);


*/

    // private List<Review> reviews;
}
