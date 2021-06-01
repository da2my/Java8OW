/**
 * EJEMPLO DE USO DE UNA CLASE INTERNA, PARA CREAR
 * UNA COLECCI�N CON UN ITERADOR
 */
package internas;

/**
 * @author Openwebinars
 *
 */
public class MiColeccion {

	private final static int TAM = 15;
	private int[] array = new int[TAM];

	public MiColeccion() {// inicializacion con unos valores por defecto
		for (int i = 0; i < TAM; i++)
			array[i] = i + 1;// posiciones pares quitando la suma de + 1
	}

	public void imprimirPares() {// Este es el iterador para imprimir los pares. Y un iterador suele tener 2
									// metodos
		IteradorPares iter = this.new IteradorPares();

		while (iter.hasNext())
			System.out.print(iter.getNext() + " ");
	}

	// Iterador de posiciones pares
	private class IteradorPares {// Esta clase tiene sentido solamente en el marco de la clase que lo envuelve,
									// ejemplo claro es el concepto de iteracion en los cuales su funcion seria el
									// permitirnos recorrer una secuencia de datos.

		private int siguiente = 0;

		public boolean hasNext() {// Como dijimos, tiene 2 metodos. uno de ellos es este, que indica si hay un
									// nuevo elemento que nos devuelve un booleano que nos va a permitir realizar el
									// bucle y parar cuando no haya mas
			// indica si hay mas elementos en el array
			return (siguiente <= TAM - 1);
		}

		public int getNext() {// Y otro metodo que nos devuelve el siguiente elemento que podemos tomar
								// posicionando el puntero en dos elementos por delante, para haacerlo de
								// elemento par en elemente par
			int val = array[siguiente];
			siguiente += 2;
			return val;
		}

	}

}
