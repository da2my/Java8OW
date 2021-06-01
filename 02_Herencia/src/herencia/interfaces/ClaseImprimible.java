package herencia.interfaces;

/**
 * 
 * @author Openwebinars
 *
 */
public class ClaseImprimible implements /* Imprimible, */ ImprimiblePorConsola {// Al haber herencia entre las inerfaces
																				// Imprimible e ImprimiblePorConsola nos
																				// obliga ha implementar la metodo
																				// print() Imprimible. sin necesidad de
																				// tener que implementar la interfaz
																				// desde esta clase esto nos muestra
																				// que existe tambien herencia entre
																				// interfaces

	@Override
	public void print(String s) {
		System.out.println(s);
	}

}
