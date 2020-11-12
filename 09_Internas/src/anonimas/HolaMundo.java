/**
 * EJEMPLO DE CLASES AN�NIMAS
 */
package anonimas;

/**
 * @author Openwebinars
 *
 */
public class HolaMundo {

	interface HelloWorld {// Interfaz interna definida en una clase
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {// metodo

		// Clase local
		class EnglishGreeting implements HelloWorld {
			String name = "world";

			@Override
			public void greet() {
				greetSomeone("world");

			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);

			}
		}
		// Instanciacion de la clase local
		HelloWorld englishGreeting = new EnglishGreeting();

		// Esta es una clase anonima, se llama clase anonima porque la
		// propia clase no tiene nombre, solo vamos a poder tener una sola
		// instancia de ella almacenada en la referencia frenchGreeting: definicion +
		// instanciacion
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";

			@Override
			public void greet() {
				greetSomeone("tout le monde");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		// Clase anonima que no se asigna a ninguna referencia. Esta clase al crearse,
		// como tal, aqui en medio solo va a tener utilidad si llamamos a algun metodo
		// suyo porque sino esa referencia seria ilocalizable y no la podriamos utilizar
		// Saludo en español
		new HelloWorld() {

			String name = "mundo";

			@Override
			public void greet() {
				greetSomeone("mundo");
			}
  
			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}

		}
		.greet();

		englishGreeting.greet();
		frenchGreeting.greetSomeone("Jean");

	}

	public static void main(String[] args) {
		new HolaMundo().sayHello();
	}

}
