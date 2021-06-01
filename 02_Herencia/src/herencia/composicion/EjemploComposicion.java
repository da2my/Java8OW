package herencia.composicion;

import java.util.ArrayList;
import java.util.List;

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

//		Estoy a�adiendo nuevos Municipio a la Provincia de sevilla. Porque la Provincia de Sevilla tiene una relacion de la que se componen 1 o m�s Municipios
		sevilla.getMunicipios().add(new Municipio("Sevilla", 690576));
		sevilla.getMunicipios().add(new Municipio("Dos Hermanas", 131855));
		sevilla.getMunicipios().add(new Municipio("Mairena del Aljarafe", 45040));

		System.out.println(sevilla);

		for (Municipio municipios : sevilla.getMunicipios()) {
			System.out.println(municipios);
		}

	}

}
