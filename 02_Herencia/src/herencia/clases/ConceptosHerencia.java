package herencia.clases;

public class ConceptosHerencia {

	public static void main(String[] args) {

//		1.HERENCIA DE CLASES
//		
//		HERENCIA
//		▸ Una clase que
//		extiende a otra
//		hereda sus
//		atributos y sus
//		métodos (no
//		constructores).
//		
//		La herencia es un mecanismo de asociacion entre clases mediante el cual
//		podemos definir una clase que podriamos llamar base y algunas series de 
//		clases extendidas. Las clases que extienden a una clase base, heredan sus
//		atributos y metodos salvo los constructores
//		
//		▸ Esas nuevas clases puede añadir
//		atributos y
//		métodos nuevos. 

//		MODIFICADOR PROTECTED
//		Su uso suele estar asociado a la herencia
//		▸ Si usamos protected en la clase base, las clases que hereden de ella
//		tendran acceso directo a los atributos.
//		▸ En otro caso, si usamos otro modificador como private, tendremos que acceder vía
//		getters/setters.
//		▸ ¡OJO! Los constructores no se heredan
//		aunque sean públicos.

//		2.HERENCIA DE INTEFACES
//		
//		HERENCIA DE INTERFACES
//		▸ También podemos establecer relaciones
//		jerárquicas entre interfaces como en las clases normales.
//		▸ Nos regimos por las mismas reglas que en
//		el caso de las clases.

//		3.COMPOSICIÓN DE CLASES 
//		
//		ASOCIACIONES ENTRE CLASES
//		▸ Normalmente, cuando representamos la
//		estructura de un sistema, está formado por
//		muchas clases.
//		▸ En este caso, no solamente importan las
//		clases en sí, sino las asociaciones.
//		▸ Una de ellas es la composición.
//		▸ En UML, se representan de una forma
//		especial. 

//		ASOCIACIÓN DE COMPOSICIÓN
//		 | Todo |<>---tiene-un------| Parte |		
//		 | Provincia |<>---tiene-un/os---| Municipio |

//		
//		COMPOSICIÓN DE CLASES
//		▸ Dentro de la clase Todo tendremos una
//		referencia a la clase Parte
//		▸ También es posible que la multiplicidad nos
//		indique que debemos tener una colección
//		(Provincia y Municipio).
//		▸ Normalmente hay dependencia de
//		existencia entre la parte y el todo.
//		
//		No es lo mismo composicion que herencia, no es ningun tipo de relacion, asociacion "es un". Sin embargo una Provincia esta conformada por Municipios y ahi se crea la composicion  
		
		
	}

}
