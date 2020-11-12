
public class ConceptosClaseObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HERENCIA DE OBJETC
		 * 
		 * - Todo objeto, de forma explicita o implicita hereda de Object en Java. si
		 * vamos tirando de ese arbol genealogico siempre llega a Object, es una clase
		 * base
		 * 
		 * - Es la clase base de cualquier otra en Java
		 * 
		 * - Tiene algunos metodos: equals, hashCode y toString
		 * 
		 */

		/*
		 * COMPARACION DE OBJETOS
		 * 
		 * - Con tipos primitivos se usa el operador ==
		 * 
		 * Si aplicamos dos objetos con el operador == lo unico que nos va a debolver es
		 * true si la referencia de ambas, si a y b, estan apuntando al mismo objeto a
		 * la misma posicion de memoria. si los valores de los objetos al cual apunta, a
		 * o b, son los mismos y no tenemos el metodo equals() implementado y lo
		 * comparamos con, a == b, nos devolveria false porque en el fondo no estan
		 * referenciando al mismo objeto
		 * 
		 * - ¿Que sucede con los objetos?
		 * 
		 * - Primero tenemos que definir cuando dos instancias de un objetoson iguales o
		 * diferentes
		 * 
		 * |Persona|
		 * 
		 * ---------
		 * 
		 * |nombre: String|
		 * 
		 * |apellidos: Strong|
		 * 
		 * |fechaNac: LocalDate|
		 * 
		 */

		/*
		 * EQUALS
		 * 
		 * - El metodo equals nos permite devolver un valor boolean indicando si un
		 * objeto es igual a otro
		 * 
		 * Si no implementamos en una clase el metodo equals() pues directamente, como
		 * implicitamente heredamos de Objetc, estariamos usando la implementacion de
		 * Object
		 * 
		 * - Facil de implementar puesto que nuestro IDE lo autogenera
		 * 
		 * - A la espera de una version mas compacta(Java SE 7)
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Objetcs.html
		 * 
		 */

		/*
		 * HASHCODE
		 * 
		 * - Este medodo devuelve un numero asociado a la clase
		 * 
		 * - Y sirve como composicion de memoria en hexadecimal
		 * 
		 * - Por definicion, si dos objetos son (equals), su hash code tambien debe
		 * serlo
		 * 
		 * - Con lo cual, si sobreescribimos el metodo equals, tambien tenemos que
		 * sobreescribir hashCode para que se cumple esa propiedad
		 * 
		 * Esa direccion de memoria nos suele aparecer cuando no tenemos implementado el
		 * metodo toString() en un objeto y hacemos un System.out.println(); de una
		 * referencia de ese objeto para consultarlo
		 * 
		 */

		/*
		 * TOSTRING
		 * 
		 * - Devuelve una representacion en String del objeto.
		 * 
		 * - Si el comportamiento es por defecto, devuelve el tipo (la clase) y su hashCode
		 * 
		 * - Lo podemos sebreescribir para que represente los valores
		 * 
		 * - Dos objetos iguales con el metodo equals() deben tener la misma representacion con toString()
		 */

	}

}
