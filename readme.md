# How this project was made

## To run this project
 * IntelliJ
 * The project is listening on http://localhost:8080/api/v1/bookflix

## Instructions to build a similar project
 * With the anotator @SpringBootApplication, we indicate that the Main Class is MoviesApplication.java
 * MongoDB configuration is in resources/application.properties
 * enviroment configuration are in resources/.env

### Spring Data JPA Guide 
* https://github.com/juanmacintas/tallerJPASpringData

### Annotations and concepts 

* Use of ResponseEntity
* CRUD of Books
* 

## Tools
* Table Plus for PostgresSQL Visualization
* Docker
* Postman
* 
### Package
https://start.spring.io/
 * Initializr generates spring boot project with just what you need to start quickly! [Spring Boot Maven Plugin Reference Guide](https://start.spring.io/)

### Dependencies used
 * Lombok - Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
  Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
 * Spring Web - Spring Web provides integration features such as multipart file upload functionality and the initialization of the IoC container using Servlet listeners and a web-oriented application context. It also contains an HTTP client and the web-related parts of Spring remote support.

 * Spring Data Mongo DB - Sprint with MongoDB

 * SpringBoot Developer Tools - Provides tools for developers

 * Spring dotenv - Provides a Dotenv property source for Spring and Spring Boot
(Added mannualy in the pom.xml)

 * Postgresql (To interact with postgresql database,Added mannualy in the pom.xml )
 * Spring Data JPA - Makes easy to interact with relational databases with Spring.
(Added mannualy in the pom.xml)

