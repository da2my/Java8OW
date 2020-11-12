
public class ConceptosSingletonEInmutables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. SINGLETON
		 * 
		 * PATRONES DE DISEÑO SINGLETON
		 * 
		 * - Patron de diseño (GoF).
		 * 
		 * si para una determinada clase necesitamos una y solo una instancia, es decir
		 * que si queremos tener mas de una instancia no es posible
		 * 
		 * - Para aquellas clases de las que no queremos tener mas de una instancia (por
		 * ejemplo, los servicios)
		 * 
		 * Este patron tiene utilidad para multiples contextos como para uso de
		 * servicios que se suele hacer mediante el patron SINGLETON. De hecho los
		 * framework como SPRING nos permiten hacer la inyeccion de dependencia y la
		 * definicion de esas clases cuando se levanta el contenedor de inversion de
		 * control pues al final lo que vamos haciendo es utilizar una sola instancia
		 * multiples veces, que la inyectamos alla donde la necesitemos
		 * 
		 * Sin el uso de frameworks como STRING nosotros podriamos implementar todo lo
		 * necesario para que una clase que nosotros queramos sea SINGLETON. Por ejemplo
		 * una conexion a la base de datos lo podriamos hacer mediante este patron
		 * 
		 * Como se puede ver, en el diagrama UML, el diseño de una clase singleton suele
		 * lleva aparejado una serie de operciones clasicas. Vamos a tener almacenada
		 * dentro de la propia clase una instancia que sera estatica y un metodo
		 * getInstance que nos va a devolver la instancia de la clase si es que existe y
		 * si no existe pues la va a crear antes de devilverla
		 * 
		 * [VER FOTO DE DIAGRAMA UML, ESTA EN EL MAIL DAVO]
		 */

		/*
		 * 2. INMUTABLES
		 * 
		 * OBJETOS INMUTABLES
		 * 
		 * - Objetos cuyo estado no puede ser modificado una vez se haya inicializado
		 * 
		 * - No son constantes (estas se definen en tiempos de compilacion, y los
		 * inmutables en tiemopo de ejecucion). Ejemplo de objeto inmutable es un
		 * programa en el que vamos tomando los valores que el usuario introduce por
		 * consola y a partir de eso quisieramos construir un objeto que no se quisiera
		 * modificar.
		 * 
		 * - Un ejemplo de objeto inmutables son los objetos de tipo String
		 * 
		 */

		/*
		 * ESTRATEGIAS PARA HACER OBJETOS INMUTABLES
		 * 
		 * Para haceer un objeto inmutable tenemos que tomar es una estrategia, con una
		 * serie de pasos que son sencillos
		 * 
		 * - Definir las propiedades como final y private
		 * 
		 * - No añadir metodos setter sino solamente metodos getter de esa manera
		 * solamente podriamos inicializar los valores en la construccion a traves del
		 * constructor y a partir de ahi no tendriamos manera, si los atributos son
		 * privados y no hay setter no podriamos modificar su valor
		 * 
		 * - Declarar la clase misma como final. Para que no se pudiera implementar una
		 * clase que extendiera de esta clase que implementara a los setter, lo que se
		 * hace es declarar a la clase como final
		 * 
		 * 
		 */
	}

}
