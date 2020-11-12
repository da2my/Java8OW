/**
 * EJEMPLO DE USO DE UNA CLASE SINGLETON
 */
package singleton;

/**
 * @author Openwebinars
 *
 */
public class UsoSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// No podemos instanciar directamente al constructor del servicio porque lo
		// hemos definido como privado
		// MiServicioSingleton ser1 = new MiServicioSingleton();

		// Creamos dos referencias (es como declarar dos variables), pero una sola instancia definidas por el metodo getInstance()
		MiServicioSingleton ser2 = MiServicioSingleton.getInstance();
		MiServicioSingleton ser3 = MiServicioSingleton.getInstance();

		// Podemos comprobar que la direccion de memoria (referencia) es la misma porque ser2 y ser3
		// estan apuntando al mismo objeto (singleton), e imprime la referencia del
		// objeto en hexadecimal para comprobarlo
		System.out.println(ser2);
		System.out.println(ser3);

		// Si cambiamos un atributo a traves de una referencia
		ser2.setUnAtributo("Hola");
		// Podemos visualizarlo desde la otra.
		System.out.println(ser3.getUnAtributo());
		
		
		
	}

}
