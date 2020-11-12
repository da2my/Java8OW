package herencia.composicion;

/**
 * 
 * @author Openwebinars
 *
 */
public class EjemploComposicion {// No es lo mismo composicion que herencia, no es ningun tipo de relacion,
									// asociacion "es un". Sin embargo una Provincia esta conformada por Municipios
									// y ahi se crea la composicion. Por eso es una asociacion de composicion

	public static void main(String[] args) {
		Provincia sevilla = new Provincia("Sevilla");// podemos ver como crear la Provincia de Sevilla y como añadir a
														// la Provincia de Sevilla una serie de Municipios

		sevilla.getMunicipios().add(new Municipio("Sevilla", 690576));
		sevilla.getMunicipios().add(new Municipio("Dos Hermanas", 131855));
		sevilla.getMunicipios().add(new Municipio("Mairena del Aljarafe", 45040));

		System.out.println(sevilla);

	}

}
