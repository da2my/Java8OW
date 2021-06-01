/**
 * 
 */
package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Openwebinars
 *
 */
public class EjemploConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Consumer<Integer> consumer = i -> System.out.print(" "+i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.println(" (hemos imprimido el " + i + ")"));
//		Consumer<Integer> anotherConsumer = consumerWithAndThen.andThen(j -> System.out.println("otro consumidor" + j));//puedo añadir otro consumidor sucesivamente
				
		//Usando expresiones lambda
		imprimirLista(lista, System.out::print);
		System.out.println("\n\n");
		//Solo utilizamos un "consumer"
		imprimirLista(lista, consumer);
		//Usamos dos consumers encadenados
		imprimirLista(lista, consumerWithAndThen);
		
//		imprimirLista(lista, anotherConsumer);//puedo encadenar otro consumidor siempre utilizando una interfaz que lo itere en este caso imprimir()

	}
	
	public static void imprimirLista(List<Integer> l, Consumer<Integer> consumer) {
		for(Integer i : l)
			consumer.accept(i);
		System.out.println("");
	}

}
