
public class ConceptosStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ATRIBUTOS DE OBJETOS Y DE CLASE
		 * 
		 * - Los objetos son instancias de una clase
		 * 
		 * - Cada objeto tiene su copia de sus propios atributos
		 * 
		 * - ¿Y si quisieramos tener un atributo comun a todos los objetos de una clase?
		 * Es decir que cada instancia no tuviera su copia sino que cada instancia
		 * tuviera acceso a esa misma copia
		 * 
		 * - Para ello tenemos el modificador static, que nos permite indicar que un
		 * atributo o un metodo pueda ser compartido por todas las instancias
		 */

		/*
		 * ATRIBUTOS ESTATICOS
		 * 
		 * - Estan asociados a la clase, no a una instancia de ella
		 * 
		 * - Son llamados atributos estaticos
		 * 
		 * - Son compartidos para todas las instancias de esa clase. Cualquier instancia
		 * tiene acceso a ese atributo estatico, desde cualquiera podriamos acceder a el
		 * 
		 * - Pueden ser manipulados por cualquier instancia
		 * 
		 * - Tambien pueden ser manipulados sin crear instancias de esa clase
		 */

		/*
		 * METODOS ESTATICOS
		 * 
		 * - Similares a las variables staticas(static)
		 * 
		 * - Se puden invocar sin necesidad de crear una instancia de esa clase
		 * 
		 * - Clase.metodoEstatico(...);
		 * 
		 * - Podemos acceder a una variable estatica, necesitamos un metodo estatico
		 * 
		 * - Clases con metodos auxiliares (como por ejemplo, java.util.Arrays)
		 */

		/*
		 * CONSTANTES
		 * 
		 * - Se suelen definir como estaticas. Muchas de ellas suelen ser definidas
		 * dentro de Interfaces
		 * 
		 * - static final ...
		 * 
		 * static final double PI = 3.141592;
		 * 
		 * - No se puede modificar su valor (error)
		 * 
		 * - Nombre en mayusculas, separando palabras con guiones bajos
		 */

		/*
		 * CLASES ESTATICAS
		 * 
		 * Este tipo de idea para las clases tiene su contexto en el uso de clases que
		 * estan dentro de otras clases. Nos van a apermitir agrupar codigo de manera
		 * que su definicion e implementacion quede lo mas cohesionada, que sigan un
		 * cierto principio de localidad
		 * 
		 * - Valido para clases internas (las estudiaremos en profundidad mas adelante)
		 * 
		 * - Nos permiten agrupar codigo
		 * 
		 * - Para crear una instancia de la clase interna, no necesita una de la clase
		 * externa
		 */

	}

}
