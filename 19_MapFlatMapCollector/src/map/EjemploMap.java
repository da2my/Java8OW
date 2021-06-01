/**
 * Ejemplo de transformaci�n con .map(...)
 */
package map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class EjemploMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Primero hacerlo una list
		List<Persona> personas = Arrays.asList(
				new Persona("Pepe", "P�rez", LocalDate.of(1990, 1, 2)),
				new Persona("Juan", "And�valo", LocalDate.of(1991, 2, 3)),
				new Persona("Miguel", "Ramos", LocalDate.of(1992, 3, 4)),
				new Persona("Carlos", "Jim�nez", LocalDate.of(1993, 4, 5))				
				);

		//Cambio de stream de persona a stream de string y despues otra vez a string a traves de lambda
		personas
			.stream()                         //Stream<Persona>
			.map(p -> p.getNombre())          //Stream<String>
			.map(s -> s.toUpperCase())        //Stream<String>
			.forEach(System.out::println);
		System.out.println("");
		
		//Cambio de stream de persona a stream de localDate y despues a stream de string a traves de lambda
		System.out.println("Fechas de cumplea�os");
		personas
			.stream()														//Stream<Persona>
			.map(p -> p.getFechaNacimiento())								//Stream<LocalDate>
			.map(f -> f.format(DateTimeFormatter.ofPattern("dd-MM")))/////////Stream<String>
			.forEach(System.out::println);
		
	}

}
