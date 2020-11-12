/**
 * EJEMPLO DE OBJETO INMUTABLE
 */
package inmutable;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public final class PersonaInmutable {

	// al declarar estos atributos como final solamete van a poder ser modificados a
	// traves de esta clase, por inicializacion de la construccion del objeto
	final private String nombre;
	final private String apellidos;
	final private LocalDate fechaNacimiento;

	public PersonaInmutable(final String nombre, final String apellidos, final LocalDate fechaNacimiento) {
		// Para asegurarnos que no se pase en los constructores un objeto que pudieramos modificar
		// desde fuera y asi tambien se modificaran, tambien se podria indicar que estos
		// objetos fuesen final. Para que la referencia no cambie desde fuera
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

}
