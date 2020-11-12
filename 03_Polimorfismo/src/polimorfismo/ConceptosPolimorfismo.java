package polimorfismo;

public class ConceptosPolimorfismo {

	public static void main(String[] args) {

		/*
		 * HERENCIA DE METODOS
		 * 
		 * - Una subclase puede acceder a los metodos de su clase base (public y
		 * protected)
		 * 
		 * - Tambien puede sobreescribir el comportamiento del mismo. Una clase que
		 * extienda a otra puede tener la implementacion de un metodo que se llame
		 * igual, tenga la misma firma que el de la clase base, con esto esta
		 * sobreescribiendo su comportamiento
		 * 
		 */

		/*
		 * REFERENCIAS Y SUBCLASES
		 * 
		 * A la hora de crear instancias de clase, podriamos tener la posibilidad de
		 * instanciar un obj de un tipo de clase hija y guardar su referencia en una
		 * variable de un tipo de clase padre. Esto es muy util cuando queremos definir
		 * un metodo que puede recibir un tipo de una clase o alguno de sus hijos o sus
		 * nietos dentro de una jerarquia de herencias
		 * 
		 * - Una subclase puede ser accedida a través de una referencia de una
		 * superclase
		 * 
		 * - Esto es muy util, sobre todo, para usar como atributo de metodos
		 * 
		 * Rectangulo r = new Cuadrado();// Un cuadrado es un tipo especial de
		 * rectangulo en el cual sus lados son del mismo tamaño de manera que podriamos
		 * crear un Cuadrado y guardar su referencia en un Rectangulo
		 * 
		 */

		/*
		 * OCULTACION DE METODOS
		 * 
		 * - Si una subclase añade un metodo con mismo nombre y firma que otro de la
		 * clase base, oculta a este.
		 * 
		 * - ¿Que sucede en caso de el uso de referencias de clase base, pero
		 * instanciacion de objetos derivados?
		 * 
		 * ¿Que sucederia si llamamos a ese metodo que ha quedado oculto, mediante la
		 * clase hija, pero con una referencia de la clase padre?
		 * 
		 * Sucede lo que se conoce como Polimorfismo
		 * 
		 * .
		 * 
		 * .
		 * 
		 * .
		 * 
		 */

		/*
		 * POLIMORFISMO
		 * 
		 * - Java escoge, en tiempo de ejecucion el metodo que tiene que implementar en
		 * fundcion del tipo de objeto.
		 * 
		 * - Si ese tipo ha ocultado un metodo de la superclase, llama a la concrecion.
		 * 
		 * - En otro caso, si no ha habido esa ocultacion, se llama al metodo de la
		 * clase base
		 */

		/*
		 * POLIMORFISMO CON INTERFACES
		 * 
		 * - Java tambien hace uso de polimorfismo con la herencia de interfaces y las
		 * clases que lo implementan
		 * 
		 * Lo que suce con la herencia de clases, tambien se tiene con la herencia de
		 * interfaces y de clases que lo implementan. Es decir podriamos tener, tambien, la
		 * posibilidad de utilizar referencias de un tipo de interfaz a la hora de
		 * guardar un objeto de una clase que implemente a esa interfaz
		 * 
		 * ClaseQueImplementaInterfaz c1 = new ClaseQueImplementaInterfaz ();
		 * 
		 * c1.saludar("Hola mundo");
		 * 
		 * 
		 * Hija c2 = new ClaseQueImplementaInterfaz ();
		 * 
		 * c2.saludar("Hola Mundo, otra vez");
		 * 
		 * 
		 * Base c3 = new ClaseQueImplementaInterfaz ();
		 * 
		 * c3.saludar("Hola Mundo, por tercera vez");
		 */
	}

}
