/**
 * EJEMPLO DE COMPARACI�N DE DOS INSTANCIAS DE UNA CLASE QUE TIENE
 * IMPLEMENTADO EL M�TODO EQUALS
 */
package equals;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Coche no tiene implementado equals
		// Toma el comportamiento por defecto de object
		Coche mercedes = new Coche("Mercedes", "A200", "2.0 TDI");
		Coche volkswagen = new Coche("VolksWagen", "Passat", "2.0 TDI");

		if (mercedes.equals(volkswagen))
			System.out.println("Los dos coches son iguales");
		else
			System.out.println("Son diferentes");

		// Asigna a las dos referencias el mismo objeto en memoria
		// No copia valores, es decir no tenemos 2 objetos distintos en memoria sino que
		// las dos referencias estan apuntando en la misma direccion de memoria. en este
		// punto nos dira que su referencia en memoria es la misma
		volkswagen = mercedes;

		// Esta l�nea de c�digo es equivalente al bloque if/else de arriba
		System.out.println((mercedes.equals(volkswagen)) ? "Los dos coches son iguales" : "Son diferentes");

		System.out.println("Mercedes: " + mercedes);
		System.out.println("Volkswagen: " + volkswagen);

		System.out.println("\n\n\n");
		// Persona si que tiene implementado el m�todo equals
		Persona rafaNadal = new Persona("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		Persona otroRafaNadal = new Persona("Rafael", "Nadal Parera", LocalDate.of(1986, 6, 3));
		Persona rogerFederer = new Persona("Roger", "Federer", LocalDate.of(1981, 8, 8));

		System.out.println((rafaNadal.equals(otroRafaNadal)) ? "Las dos personas son iguales" : "Son diferentes");// son
																													// iguales
																													// aunque
																													// sus
																													// referencias
																													// sean
																													// francamente
																													// distintas,
																													// esto
																													// es
																													// porque
																													// se
																													// esta
																													// haciendo
																													// las
																													// comprobacion
																													// de
																													// los
																													// atributos
																													// que
																													// conforman
																													// a
																													// la
																													// persona
																													// y
																													// estas
																													// son
																													// iguales

		System.out.println((rafaNadal.equals(rogerFederer)) ? "Las dos personas son iguales" : "Son diferentes");

		System.out.println("rafaNadal:" + rafaNadal);
		System.out.println("otroRafaNadal:" + otroRafaNadal);
		System.out.println("rogerFederer:" + rogerFederer);

	}

}
