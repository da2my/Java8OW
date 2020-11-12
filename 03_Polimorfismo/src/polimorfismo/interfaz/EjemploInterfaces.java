/**
 *  Ejemplo de polimorfismo, utilizando como tipos de las
 *  referencias algunas interfaces.
 */
package polimorfismo.interfaz;

/**
 * @author Openwebinars
 *
 */
public class EjemploInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {// Tenemos 3 posibilidades, y utilizar a los distintos metodos saludar()
											// para saber a quien estamos llamando para evidenciar el polimorfismo

		ClaseQueImplementaInterfaz c1 = new ClaseQueImplementaInterfaz();// Se instancia la clase y se almacena en una
																			// referencia de la propia clase que llama a
																			// saludar()
		c1.saludar("Hola Mundo");

		Hija c2 = new ClaseQueImplementaInterfaz();// Se instancia la clase y se almacena en una refenrencia de tipo
													// Hija y llama a saludar()
		c2.saludar("Hola Mundo, otra vez");

		Base c3 = new ClaseQueImplementaInterfaz();// Se instancia la clase y se almacena en una referencia de tipo Base
													// y llama a saludar()
		c3.saludar("Hola Mundo, por tercera vez");

	}

}
