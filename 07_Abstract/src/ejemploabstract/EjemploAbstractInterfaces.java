/**
 * EJEMPLO DE USO DE CLASES Y M�TODOS ABSTRACTOS
 */
package ejemploabstract;



/**
 * @author Openwebinars
 *
 */
public class EjemploAbstractInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Imposible crear una instancia de la clase abstracta ObjetoGrafico
//		ObjectoGrafico o = new ObjetoGrafico();
		
		Circulo c = new Circulo(1,1,7);
		c.dibujar();
		c.cambiarTamanio(2);
		c.moverA(3, 3);
		c.dibujar();
		
//		Al igual que con cualquier otro tipo de 2 clases que hereden la una de la otra
//		podriamos usar la clase abstract ObjectoGrafico como tipo de la referencia del objeto Circulo
		//Podemos usar el Circulo con una referencia de tipo ObjetoGrafico
		ObjectoGrafico o = c;
		System.out.println("Dibujando un circulo desde un objeto grafico");
		o.dibujar();
		
		

	}

}
