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
//	private static int m;

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
		// a no ser que los atributos de la clase externa sean estaticos
//		public int getN() {
//			return m;
//		}

	}

}
