/**
 * 
 */
package bytes.fileoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Openwebinars
 *
 */
public class EjemploFileOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//OutputStream es una clase abstracta, y nos permite hacer referencia a cualquier flujo
		OutputStream fOut = null;//Debemos definir la referncia al flujo fuera del bloque try-catch-finally
		// ¿Try con recursos? dice que seria de total aplicacion en este caso por que
		try {
			// Bloque try donde, abriremos el canal de comunicaciones(instanciamos el
			// flujo), procesar los datos mientras lo haya(escribir datos en el flujo)
			fOut = new FileOutputStream("primero.dat");// Nos permite escribir bytes en un fichero con write()
			for (int i = 0; i < 1000; i++) {//(ver min.8:35)la manera de trabajar con bytes en este tipo de flujo viene heredada de c
				fOut.write(i);//se va a escribir en binario
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// Bloque finally donde siempre cerramos el flujo
			if (fOut != null)
				try {// Ademas el cierre del flujo podria generar otra excepcion
					fOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}
}
