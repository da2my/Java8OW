/**
 * Ejemplo de un Servicio que implementa el patr�n Singleton
 */

package singleton;

/**
 * @author Openwebinars
 *
 */
public class MiServicioSingleton {// Tenemos una clase MiServicioSingleton que nos ofrece una serie de metodos de
									// logica de negocio pero del cual queremos que solamente exista una instancia.

	private String unAtributo;

	// Una instancia del objeto que va a existir
	private static MiServicioSingleton instance = null;// Debemos tener siempre un atributo privado y estatico que sea
														// una referencia de la propia clase, de ahi el mismo nombre

	// Evitamos asi la instanciacion directa
	private MiServicioSingleton() {//Esto evita la construccion directa del objeto mediante el modificador de acceso
	}

	public static MiServicioSingleton getInstance() {//Esta operacion se realizara solamente una vez y a partir de ahi iremos devolviendo la misma instancia
		if (instance == null)//si la instancia es null 
			instance = new MiServicioSingleton();//lo que hacemos es crear el objeto
		//tanto si la instancia es null o ya se acaba de crear el objeto ya devolvemos la instancia. Esta operacion se se realiza una sola vez y a partir de ahi se ira devolviendo la misma instancia simpre
		return instance;
	}

	public String getUnAtributo() {
		return unAtributo;
	}

	public void setUnAtributo(String unAtributo) {
		this.unAtributo = unAtributo;
	}

}
