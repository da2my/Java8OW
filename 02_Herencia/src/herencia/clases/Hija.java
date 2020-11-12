/**
 * 
 */
package herencia.clases;

/**
 * @author Openwebinars
 *
 */
public class Hija extends Base {
	
	public Hija(String n, String a) { //Esta clase, subclase o hija, puede invocar al constructor de la clase base utilizando super()
		super(n, a);
	}
	
	public void metodo() {
		//this.nombre = Pepe;   // Imposible acceder. Nos da error porque el atributo esta declarado en la clase base como private
		this.setNombre("Pepe"); // Funciona perfectamente ya que utilizamos el metodo setNombre() para utilizar el atributo de la clase base
		this.apellidos = "Perez"; //Sin embargo para atributos de tipo protected no hay problemas para acceder a ellos
	}
	
	public void print() {
		System.out.println(this.getNombre() + " " + this.apellidos);//Asi se accede a los atributos y se utiliza tanto private como protected
	}

}
