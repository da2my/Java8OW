/**
 * 
 */
package supplier;

import java.util.function.Supplier;

/**
 * @author Openwebinars
 *
 */
public class EjemploSupplier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Supplier<Item> supplier = Item::new;// Creamos un supplier para instanciar un objeto, sera una de las misiones
											// mas tipicas. Con "Item::new" hacemos uso de la referencia a metodos
		Item item = supplier.get();//Con el metodo get() de supplier podemos obtener ese objeto
		System.out.println(item.getMsg());

		Supplier<String> supplier2 = Item::getStaticVal;//Podemos obtener el supplier a partir de este metodo estatico
		String valor = supplier2.get();
		System.out.println("Llamada a método estático: " + valor);

		Supplier<String> supplier3 = () -> {//Con sintaxis de expresiones lambda...
			return new String("Hola Mundo!");
		};
		// Supplier<String> supplier3 = () -> "Hola Mundo!";
		valor = supplier3.get();//... para obtener un valor de String
		System.out.println("Obtención de un valor nuevo: " + valor);

	}

}
