package referencias;

public class ComparadorPersonas {//agrupar a personas por diferentes criterios
	
	public int compararPorNombre(Persona a, Persona b) {
        return a.getNombre().compareTo(b.getNombre());
    }
        
    public int compararPorEdad(Persona a, Persona b) {
        return a.getFechaNacimiento().compareTo(b.getFechaNacimiento());
    }

}
