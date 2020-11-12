/**
 * OTRO EJEMPLO DE CLASE AN�NIMA, PARA MODIFICAR EL ORDEN NATURAL DE LOS NUMEROS
 */
package anonimas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class SortAnonimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Orden inverso a trav�s de una clase an�nima
		listaNumeros.sort(new Comparator<Integer>() {// Comparator es una interfaz especial que tiene un solo metodo
														// abstracto que se llama compare()

			@Override
			public int compare(Integer arg0, Integer arg1) {// Nos permite hacer la comparacion de ambos. Debe devolver
															// cero si son iguales, -1 si el primero es menor que el
															// segundo o +1 si el segundo es mayor que el primero
				return -arg0.compareTo(arg1);//Se da la vuelta al orden con el "-arg0"
			}

		});//Como podemos comprobar esto es una instancia anonima que sirve para pasarsela a la llamada de un metodo

		for (Integer i : listaNumeros)
			System.out.print(i + " ");

	}

}
