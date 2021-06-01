/**
 * EJEMPLO DE USO DE CLASES ANIDADAS EST�TICAS Y NO EST�TICAS
 */
package anidadas;

/**
 * @author Openwebinars
 *
 */
public class EjemploExternaAnidada {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Podemos instanciar AnidadaEstatica sin necesidad de tener
		// una instancia de la clase Externa
		Externa.AnidadaEstatica ie = new Externa.AnidadaEstatica("Hola");

		// No podemos hacer esta instanciacion asi
		// Externa.Interna i = new Externa.Interna("Mundo");

		// Estas son las dos formas de instanciar una clase
		// anidada NO estatica.
		// Creando primero la instancia externa...
		Externa e = new Externa(1);
		// ...y usandola para crear la anidada.
		Externa.Anidada i = e.new Anidada("Mundo");
		// O por otro lado creando ambas instancias a la vez
		Externa.Anidada i2 = new Externa(2).new Anidada("Mundo");// !!!!!!!DENTRO DE LA REFERENCIA i2 ESTAMOS
																	// INSTANCIANDO UN OBJ DE LA CLASE EXTERNA Y UN OBJ
																	// DE LA CLASE ANIDADA!!!!!!
		System.out.println(i.getN());
		System.out.println(i2.getN());
		System.out.println(i2.toString());

	}

}
