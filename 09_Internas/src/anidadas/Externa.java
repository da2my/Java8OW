/**
 * 
 */
package anidadas;

/**
 * @author Openwebinars
 *
 */
public class Externa {// Una unica clase publica en un fichero Java, no podemos tener ninguna mas.
						// Pero si podemos tener dentro de esta clase, algunas clases.

	private int n;
//	private static int m; //para acceder desde la clase estatica anidad

	public Externa(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public class Anidada {

		private String s;

		public Anidada(String s) {
			this.s = s;
		}

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		// Como clase anidada, puede acceder a los atributos de la
		// clase externa.
		public int getN() {
			return n;
		}

		@Override
		public String toString() {
			return "Anidada [s=" + s + "]";
		}
		
		

	}

	public static class AnidadaEstatica {

		private String str;

		public AnidadaEstatica(String str) {
			this.str = str;
		}

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}

		// Como clase interna estatica, no puede acceder
		// a los atributos de la clase externa.
		// a no ser que los atributos de la clase externa sean estaticos. Declaramos "m"
		// como variable estatica para ver como si la queremos utilizar por aqui se
		// quita el error
//		public int getN() {
//			return n;//utiliza la "m" en vez de "n" para utilizar este metodo para acceder a un atributo de la clase externa
//		}

	}
}
