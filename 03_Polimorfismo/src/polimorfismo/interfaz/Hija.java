/**
 * Interfaz Hija (que extiende a Base)
 */

package polimorfismo.interfaz;


/**
 * @author Openwebinars
 *
 */
public interface Hija extends Base {
//	Si comento este metodo estaria solo utilizando el metodo de la clase base desde el main
	public default void saludar(String s) {
		System.out.println(s + " desde Hija");
	}

}
