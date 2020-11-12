/**
 * DIFERENTES TIPOS DE EJEMPLO DE VARIABLE FINAL
 */
package ejemplovariablefinal;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploVariablesFinal {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Referencias final "p" a un objeto Persona
		final Persona p = new Persona("12345678A", "Pepe", "Perez", Persona.HOMBRE, LocalDate.of(1950, 1, 1));
		System.out.println(p);
		p.setNombre("Jose");
		System.out.println(p);

		// No nos permite realizar esta reasignacion del objeto. No podemos modificar
		// esta referencia
		// p = new Persona("23456789B", "Ana", "Martinez", Persona.MUJER,
		// LocalDate.of(1960, 2, 2));

		// Arrays final. Si creamos un array como final matrimonio1, podriamos modificar
		// los elementos que conforman ese array
		final Persona[] matrimonio1 = new Persona[2];
		Persona[] matrimonio2 = new Persona[2];// array no final

		matrimonio1[0] = p;// podriamos modificar los elementos que conforman ese array

		// Tampoco nos deja hacer esta asignacion. Lo que no se podria hacer es asignar
		// al array final otro array diferente
		// matrimonio1 = matrimonio2;

		// Podemos referenciar a un objeto referenciado como final,
		// desde una referencia que no es final. Si ponemos asociar p2, que es otra
		// referencia, asignarle el valor de la referencia
		// de p, que es final. Y al no ser p2 una referencia final, pues si que podrimos
		// asignar otro objeto diferente y hacer las
		// modificaciones correspondientes
		Persona p2 = p;// otra referencia que apunta al mismo objeto
		System.out.println(p2);

		// Esta referencia NO final si que puede ser reasignada
		p2 = new Persona("23456789B", "Ana", "Martinez", Persona.MUJER, LocalDate.of(1960, 2, 2));// objeto distinto en
																									// la referencia que
																									// no es final y le
																									// esta dando sus
																									// valores
																									// correspondientes
		System.out.println(p2);

	}

	public static Persona metodoConParametroFinal(final Persona p) {// preciamos como usar final asociado a objetos, a
																	// la hora de definir los argumentos que recibe un
																	// metodo. podriamos indicar que el
																	// metodoConPrametrosFinal() va a recibir una
																	// persona, esa persona que reciba desde fuera; no
																	// tiene porque ser final pero cuando se recibe aqui
																	// esa referencia se transformara en final
		// No nos permite realizar esta reasignacion del objeto. No podemos modificar la
		// referencia asignandole otro valor
		// p = new Persona("23456789B", "Ana", "Martinez", Persona.MUJER,
		// LocalDate.of(1960, 2, 2));
		return p;
	}

}
