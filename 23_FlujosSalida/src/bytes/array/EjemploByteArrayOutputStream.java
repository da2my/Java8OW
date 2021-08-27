/**
 * 
 */
package bytes.array;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Openwebinars
 *
 */
public class EjemploByteArrayOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] buffer = new byte[1024 * 32];
		Arrays.fill(buffer, Byte.parseByte("1"));
		ByteArrayOutputStream baos = null;
		try {
			baos = new ByteArrayOutputStream();// Podriamos escribir en un determinado flujo que esta escribiendo en
												// memoria y obtenerlo de una sola vez. Los flujos que trabajan con
												// memoria son utiles para leer un fichero completo y escribirlo en
												// memoria para poder trabajar con el, o la operacion inversa, a aprtir
												// de algo qeu tenemos en memoria montar un buffer y despues trabajar
												// con el como si se tratara de un flujo [PARA ANDROID se utilizan
												// ByteArray, de este tipo, de entrada o de salida para el tratamiento
												// de imagenes como comprimir, cambiar la extension]
			baos.write(buffer);
			System.out.println(baos.toByteArray().length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (baos != null)
				try {
					baos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
