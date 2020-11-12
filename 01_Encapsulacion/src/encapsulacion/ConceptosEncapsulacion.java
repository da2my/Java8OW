package encapsulacion;

public class ConceptosEncapsulacion {

	public static void main(String[] args) {

		/*
		 * OBJETOS: ESTRUCTURA Y COMPORTAMIENTO
		 * 
		 * ▸ En general, todos los objetos tienen una estructura (como están conformado)
		 * y un comportamiento (realizan una serie de operaciones).
		 * 
		 * ESTRUCTURA
		 * 
		 * - Plástico
		 * 
		 * - 4 ruedas
		 * 
		 * - 1 volante
		 * 
		 * - …
		 * 
		 * COMPORTAMIENTO
		 * 
		 * - Mover adelante
		 * 
		 * - Mover atrás
		 * 
		 * - …
		 */

		/*
		 * ENCAPSULACIÓN
		 * 
		 * ▸ Los objetos conocen solamente su estructura, no la de los demás. un objeto
		 * es el que se conoce por dentro y ofrece al exterior una pequeña parte dejando
		 * oculto una gran parte de el
		 */

		/*
		 * ENCAPSULACIÓN
		 * 
		 * ▸ El trato entre objetos se realiza a través de los métodos.
		 * 
		 * ▸ Normalmente, los atributos de un objeto se deben consultar o editar a
		 * través de métodos.
		 */

		/*
		 * DEFINICIÓN E IMPLEMENTACIÓN DE UNA CLASE
		 * 
		 * <modificador> class NombreDeLaClase {
		 * 
		 * //propiedades
		 * 
		 * int propiedad1;
		 * 
		 * String propiedad2;
		 * 
		 * float propiedad3;
		 * 
		 * //…
		 * 
		 * 
		 * //metodos void metodo1() {
		 * 
		 * //…
		 * 
		 * }
		 * 
		 * //…
		 * 
		 * }
		 */

//		MODIFICADORES DE ACCESO
//		▸ Nos permiten indicar quien puede hacer
//		uso de una clase, o de sus atributos y
//		métodos.
//		▸ public: cualquiera
//		▸ private: solo la propia clase
//		▸ protected: la propia clase y sus derivados
//		▸ Por defecto: las clases cercanas (que estén en el mismo paquete). 

//		BEST PRACTICES
//		
//		▸ La mayoría de las clases que se crean son
//		públicas.
//		▸ Cada fichero .java tendrá solamente una
//		clase pública, con el mismo nombre del
//		fichero.
//		
//		public class MiClase {
//		//propiedades
//		//…
//		//metodos
//		//…
//		}

//		BEST PRACTICES (II)
//		
//		▸ La mayoría de los atributos de una clase casi siempre
//		serán privados.
//		▸ Solamente algunas constantes, o casos
//		muy muy particulares, tendrán otra
//		modificador de acceso.

//		Lo normal es que los atributos de una clase sean privados y
//		sean expuestos al exterior a traves de los metodos getters y setters
//		u otros metodos que nos ayunen a implementar la logica de nuestra app
//		
//		public class MiClase {
//		//propiedades
//		 private int numero;
//		 private String nombre;
//		//metodos
//		//…
//		} 

//		BEST PRACTICES (III)
//		▸ Si una clase tiene atributos, seguramente
//		tenga métodos públicos.
//		▸ Los métodos privados son interesantes
//		para cálculos auxiliares o parciales (solo se
//		pueden invocar desde la propia clase).

//		public class MiClase {
//		//propiedades
//		 private int numero;
//		 private String nombre;
//		
//		//metodos
//		 public int getNumeroſƀ { … }
//		} 

//		TIPOS DE CLASES
//		▸ Java solo tiene “una forma” de crear
//		clases, a través de la palabra reservada class.
//		
//		Podemos diferenciar las clases según su
//		cometido:
//		▸ Modelo
//		▸ Servicios
//		▸ Auxiliares
//		▸ Main
//		▸ Test
//		▸ …

//		TIPOS DE CLASES
//		▸ Modelo: representan objetos o hechos de la naturaleza: un coche, un asiento
//		contable, los datos meteorológicos de un día en particular. Suelen tener atributos privados,
//		getters y setters, equals, hashCode, toString, …
//		
//		▸ Servicios: Suelen se clases que implementan la lógica de negocio, es decir lo propio de nuestro sistema. Suelen tener algunos
//		atributos, pero sobre todo métodos públicos y privados.
//				
//		▸ Auxiliares: sirven para realizar operaciones auxiliares de cálculo o transformación de datos.
//		Mayoritariamente, sus métodos son estáticos los cuales podriamos invocar en cualquien punto de nuestro codigo.
//		
//		▸ Main: son el punto de entrada de la aplicación. La mayoría de las ocasiones, solo tienen este 
//		método; el metodo Main, y si tienen más, suelen ser estáticos.
//		 
//		▸ Test: clases especiales que estan orientadas a realizar pruebas de nuestra aplicación. En Java, suelen ser
//		test unitarios con JUnit. 

	}

}
