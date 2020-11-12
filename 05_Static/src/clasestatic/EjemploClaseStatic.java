/**
 * En este ejemplo podemos ver el uso de clase internas est�ticas,
 * que permiten crear instancias de ellas sin crear una instancia
 * de la clase que la envuelve.
 */
package clasestatic;

/**
 * @author Openwebinars
 *
 */
public class EjemploClaseStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona p = new Persona("Pepe");
		System.out.println(p);

		// Trabajaremos esto en profundidad en cap�tulos posteriores
		OtraClase o = new EjemploClaseStatic().new OtraClase("Juan");// sin embargo para una clase que no sea estatica
																		// tendriamo que crear primero una instacia de
																		// la clase externa, de la que envuelve
																		// [EjemploClaseStatic()] para poder tener una
																		// instacia de esta otra clase que no esta definida como
																		// estatica [OtraClase()] para poder tener
																		// acceso a ella
		System.out.println(o);
	}

	public static class Persona {

		private String nombre;

		public Persona(String nombre) {
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Persona [" + (nombre != null ? "nombre=" + nombre : "") + "]";
		}

	}

	public class OtraClase {

		private String atributo;

		public OtraClase(String atributo) {
			this.atributo = atributo;
		}

		@Override
		public String toString() {
			return "OtraClase [" + (atributo != null ? "atributo=" + atributo : "") + "]";
		}

	}

}
