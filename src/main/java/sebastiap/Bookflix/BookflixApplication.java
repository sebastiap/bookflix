package sebastiap.Bookflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;

@SpringBootApplication
public class BookflixApplication {

	public class GenericMethodTest {
		// generic method printArray
		public static <E> void printArray(E[] inputArray) {
			// Display array elements
			for (E element : inputArray) {
				System.out.printf("%s ", element);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("Hola a todos los pibes 2");
		Character[] arrey = {'1','2','3'};
		GenericMethodTest.printArray(arrey);
		SpringApplication.run(BookflixApplication.class, args);
	}

}
