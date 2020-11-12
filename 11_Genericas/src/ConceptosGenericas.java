
public class ConceptosGenericas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CREACIÓN DE
//		UNA CLASE

//		GENÉRICA
//		CLASE GENÉRICA
//		▸ Se trata de una clase parametrizada sobre
//		uno o más tipos de datos concretos
//		
//		public class Box {
//		 private Object object;//Es una referencia de Object. Este tipo de código es propenso a producir errores al 
		// no comprobar el tipo de dato concreto de lo que ahi estamos almacenando y nos
		// bliga a hacer
		// casting continuamente para sacar el tipo concreto que hemos almacenado ahi
//		
//		 public void set(Object object) {
//		 this.object = object;
//		 }
//		
//		 public Object get() {
//		 return object;
//		 }

//		}
//

//		CLASE GENÉRICA A PARTIR DE
//		JAVA SE 5
//		
//		Se asigna el tipo en tiempo de compilación. Se nos permite crear autenticas clases parametrizadas.
//		Con el operador de parametrizacion podemos indicar el tipo concreto al momento de la compilacion.
//		De manera que utilzando un tipo generico <T> que podra ser String, integer o una clase propia que nosotros creemos.
//		Este codigo nos garantiza frente a errores mucho mas que el anterior
//		
//		public class Box<T> {
//		 private T object;
//		 public void set(T object) {
//		 this.object = object;
//		 }
//		 public T get() {
//		 return object;
//		 }
//		}
//

//		CLASE GENÉRICA A PARTIR DE
//		JAVA SE 5
//		
//		Podriamos crear una clase generica parametrizada sobre 2 tipos diferentes
//		
//		public class Par<T, S> {//Con esta clase podriamos guardar un objeto de un tipo y otro objeto de otro tipo
//		 private T obj1;
//		 private S obj2;
//		 //Resto de la clase
//		}

//		CONVENCIÓN SOBRE EL NOMBRE
//		DE PARÁMETROS
//		
//		Los nombres de tipos de párametros más
//		usados son:
//		▸ E (element, elemento) //si se refiere a un elemento de una coleccion
//		▸ K (key, clave)	//en caso de genericos 
//		▸ N (number, número) 	//tipo numerico
//		▸ T (type, tipo)
//		▸ V (value, valor)
//		▸ S, U, V, … (2º, 3º, 4º, … tipo)

//		INSTANCIACIÓN Y OPERADOR
//		DIAMOND
//		▸ Para instanciar un objeto genérico,
//		tenemos que indicar los tipos dos veces, uno en la referencia y otro en el constructor para que este sepa que tipo tiene que 
//		utilizar a la hora de construir el objeto. 
//		 Par<String, String> pareja2 =
//		 new Par<String, String>("Hola", "Mundo");
//		
//		▸ El estilo anterior es muy verboso, cansino de escribirlo.
//		▸ Desde Java SE 7 tenemos el operador <>
//		(diamond).
//		Solo tenemos que definir, en la referencia, los tipo de datos que vamos a utilizar
//		ya que en el constructor solo con <> nos valdria. 
//		 Par<String, String> pareja2 =
//		 new Par<>("Hola", "Mundo"); 
		
		
//		GENÉRICOS CON TIPOS CERRADOS
//		▸ Podemos indicar que el tipo
//		parametrizado sea uno en particular (o sus
//		derivados).
//		
//		public class NumericBox<T extends Number> {//Podemos acotar a esta clase concreta y a sus derivados de los que hereda.
//		 private T object;
//		 //resto de la clase
//		}
//		 
//		GENÉRICOS CON TIPOS CERRADOS
//		▸ Podemos indicar más de un tipo con &. 
//		▸ Solo uno de ellos puede ser una clase.
//		▸ El resto deben ser interfaces
//		▸ La clase a extender debe ser la primera de
//		la lista.
//		
//		public class A {
//		 //resto de la clase
//		}
//		
//		public interface B {
//		 //resto de la interfaz
//		}
//		
//		public class StrangeBox
//		 <T extends A & B> {
//		 //resto de la clase
//		}
//
//		 
//		GENÉRICOS CON TIPOS COMODÍN
//		▸ Nos permiten relajar el tipo concreto de
//		una clase genérica a un subtipo con el operador ?.
//		▸ Útil con colecciones.
//		public static double sumOfList(List<? extends Number> list)
//		{
//		 double s = 0.0;
//		 for (Number n : list)
//		 s += n.doubleValue();
//		 return s;
//		} 

	}

}
