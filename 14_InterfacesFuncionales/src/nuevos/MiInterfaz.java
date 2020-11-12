package nuevos;

@FunctionalInterface
public interface MiInterfaz {//solamente un metodo abstract define que la interfaz sea funcional. Si tiene 2 no seria una interfaz funcional
	
	void print(String str);//metodo abstract
	
//	void otroMetodo();//esete metodo abstract no puede cohexistir con el metodo abstract de arriba
	
	boolean equals(Object o);//metodo que esta presente en la clase Object
	
	default void defecto() {
		System.out.println("M�todo con implementaci�n por defecto");
	}
	
	static void estatico() {
		System.out.println("M�todo est�tico");
	}

}
