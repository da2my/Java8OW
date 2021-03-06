/**
 * 
 */
package comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comparable.Persona;

/**
 * @author Openwebinars
 *
 */
public class EjemploComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();

		listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		listaPersonas.add(new Persona("23456789B", "Juan", "Martinez", LocalDate.of(1981, 2, 3)));
		listaPersonas.add(new Persona("34567890C", "Ana", "Ramirez", LocalDate.of(1972, 3, 4)));
		listaPersonas.add(new Persona("45678901D", "Maria", "Lopez", LocalDate.of(1993, 4, 5)));

		// Comparator para ordenamos de mas joven a mas viejo
		listaPersonas.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return -o1.compareTo(o2);// Si te preguntas porque ordena la fecha de nacimiento, es porque en la clase
											// Persona sobreescribe compareTo(p.getFechaNacimiento())
			}

		});

		System.out.println("Lista de personas, ordenadas de mas joven a mayor edad");
		for (Persona p : listaPersonas)
			System.out.println(p);

		// Otro Comparator, ordenamos alfabeticamente por apellido
		listaPersonas.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getApellidos().compareTo(o2.getApellidos());
			}

		});

		System.out.println("Lista de personas, ordenadas alfabeticamente por apellido");
		for (Persona p : listaPersonas)
			System.out.println(p);

	}

}
