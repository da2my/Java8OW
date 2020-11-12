
public class ConceptosColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		CREACIÓN Y USO
//		DE LIST, SET Y
//		MAP
//		API COLLECTIONS
//		Desde Java SE 2 se ofrece el tratamiento de
//		colecciones. Actualmente tiene
//		▸ Interfaces: tipos de datos
//		▸ Implementaciones: concreciones de los
//		diferentes interfaces.
//		▸ Algoritmos: para realizar operaciones
//		como ordenación, búsqueda, …
//		Todas las colecciones están definidas como
//		genéricas. Es decir, tenemos que indicar el tipo o tipos sobre el cual vamos a utilizarlo
		
		
	
//		1.
//		COLECCIONES
//		LINEALES (LIST) 
		
//		INTERFAZ LIST
//		▸ Todos los elementos tienen posición y podemos hacer un acceso posicional a esos elementos
//		▸ Permite duplicados. Es decir, no hay comprobacion de si un elemento a la hora de insertarse esta contenido o no
//		▸ También permite búsqueda e iteraciones
//		▸ Las implementaciones más conocidas son ArrayList y LinkedList.
//		▸ Si no sabemos cual escoger, utilizaremos siempre ArrayList. 

//		CONSTRUCCIÓN DE UN LIST
//		A partir de Java 1.5
//		▸ Inclusión de los genéricos
//		▸ Permiten parametrizar el tipo
//		List<String> cars = new ArrayList<String>();
		
//		A partir de Java 1.7
//		▸ Operador diamond
//		▸ Nos ahorra indicar dos veces el tipo
//		List<String> cars = new ArrayList<>(); 

//		OPERACIONES CON LIST
//		Nombre Uso
//		add: Añade un elemento al final la lista
//		addAll: Añade todos los elementos de la colección pasada como argumento
//		clear: Elimina todos los elementos de la lista.
//		contains: Comprueba si un elemento está o no en la lista
//		get: Devuelve el elemento de la posición especificada de la lista. 
//		Tomar el elemento de una posicion especifica con get
//		isEmpty: Verifica si la lista está vacía
//		remove: Elimina un elemento de la lista
//		size: Devuelve el número de elementos de la lista
//		toArray: Devuelve la lista como un array. Transformar esa lista con el metodo toArray()   
		
		
//		2.
//		COLECCIONES SIN
//		REPETIDOS (SET) 
		
//		INTERFAZ SET
//		▸ No puede contener elementos repetidos.
//		▸ Propone tres implementaciones: HashSet,
//		TreeSet y LinkedHastSet.
//		▸ HashSet es la más eficiente, pero no nos
//		asegura nada sobre el orden en el que vamos a obtener los elementos.
//		▸ TreeSet utiliza un árbol especial Red-Black, ordena
//		según el valor.
//		▸ LinkedHashSet es un HashSet ordenado
//		por orden de inserción, tenemos una garantia al menos en el orden en el que los hemos insertado. 
		
//		OPERACIONES CON SET
//		Nombre Uso
//		add: Añade un elemento al conjunto, si aun no está contenido
//		addAll: Añade todos los elementos de la colección pasada como argumento
//		si es que aun no están presentes.
//		clear: Elimina todos los elementos del conjunto.
//		contains: Comprueba si un elemento está o no en el conjunto
//		isEmpty: Verifica si el conjunto está vacío
//		remove: Elimina un elemento del conjunto
//		size: Devuelve el número de elementos de la lista
//		toArray: Devuelve la lista como un array 
	
//		3.
//		COLECCIONES
//		CLAVE, VALOR 
		
//		INTERFAZ MAP
//		▸ No es un subtipo de Collection (List y Set sí que lo son).
//		▸ Cada elemento tiene estructura clave, valor. Como un diccionario que se localizan las palabras en base a la propia palabra
//		y a continuacion de esa palabra tenemos la definicion de esa palabra. Por lo tanto un MAP no es mas que un diccionario, es decir
//		una manera de almacenar valores en funcion de una clave que nos permitirian acceder directamente a ese valor 
//		▸ La clave sirve para acceder directamente
//		al valor.
//		▸ Las implementaciones son HashMap,
//		TreeMap y LinkedHashMap. Las consideraciones son análogas a Set. 
//		
//		OPERACIONES CON MAP
//		Nombre Uso
//		clear: Elimina todos los elementos del diccionario.
//		containsKey: Comprueba si una clave está presente en el diccionario.
//		containsValue: Comprueba si un valor está presente en el diccionario.
//		get: Devuelve el valor asociado a una clave.
//		isEmpty: Verifica si el conjunto está vacío
//		keySet: Devuelve un Set con todas las claves.
//		put: Permite insertar un par clave, valor
//		remove: Elimina un elemento del conjunto
//		size: Devuelve el número de elementos de la lista
//		values: Devuelve un Collection con los valores
	}

}
