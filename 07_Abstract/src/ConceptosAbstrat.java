
public class ConceptosAbstrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ABSTRACT
//		▸ Palabra reservada
//		▸ Se puede usar a nivel de método y de
//		clase.
//		▸ Sirve para indicar la obligación de
//		implementar un método o extender una
//		clase completa. 

//		CLASES ABSTRACT
//		▸ Clase definida como abstract.
//		▸ No se pueden crear instancias de la clase abstrat.
//		▸ Puede tener métodos con implementación
//		y atributos.
//		
//		Una clase abstract sirve como base para ser extendida y terminar de matizar,
//		pero para aglutinar determionados elelmentos comunes en una jerarquia de herencias
//		
//		public abstract class AbstractaSencilla {
//
//		 public void saluda() {
//		 System.out.println("Hola mundo!!!");
//		 }
//		}

//		MÉTODOS ABSTRACT
//		▸ Deben estar obligatoriamente en una clase definida como
//		abstract. Es decir no podemos tener un metodos abstract en una clase que no sea abstract
//		▸ Definen la firma del método, pero sin
//		implementación.
//		▸ Sus subclases se comprometen a implementarlo. Una clase que extienda a otra que tiene metodos abstractos, se compromete
//		a darle una implementcion a esos metodos en caso de no querer hacerlo,lo que se hace es definir esa clase extendida tambien
//		como abstrat. Seria la unica manera que tenemos de no dar implementacion a esos metodos
//		▸ Si no lo hacen, también deben ser abstractas.
//		▸ Pueden convivir con métodos normales.
//		
//		public abstract class AbstractaConMetodos {
//
//		 public abstract void saludo(String s);
//
//		 public void saludar() {
//		 System.out.println("Hola mundo!!!");
//		 }
//		} 

//		CLASES ABSTRACT QUE
//		IMPLEMENTAN UNA INTERFAZ
//		▸ Una clase que implementa una interfaz
//		tiene la obligación de implementar todos sus
//		métodos.
//		▸ Sin embargo, una clase abstract puede
//		dejar métodos sin implementación, este hecho
//		obliga a quienes extiendan a esta clase a implementar los metodos.
//		Lo unico que hace es delegar en la clase que herede de ella en dar implementacion a esos metodos

	}

}
