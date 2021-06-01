/**
 *  Interfaz Base (para la herencia)
 */
package polimorfismo.interfaz;

/**
 * @author Openwebinars
 *
 */
public interface Base {
	
	public default void saludar(String mensaje) {
		System.out.println(mensaje + " desde Base");
	}

}
