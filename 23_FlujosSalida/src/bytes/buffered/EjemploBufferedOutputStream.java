/**
 * 
 */
package bytes.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Openwebinars
 *
 */
public class EjemploBufferedOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Trabajar con un buffering nos permite trabajar con lotes de informacion
		//Ya que no conocemos todavia los flujos de entrada. Suponiendo que hemos adquirido de alguna manera una cantidad de bytes 
		byte[] buffer = new byte[1024*32];//bytes almacenados en un array(lote) de byte. de tamaño de 32k
		Arrays.fill(buffer, Byte.parseByte("1"));
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("buffered.dat"));//Construimos un BufferOutPutStream sobre un FileOutPutStream(ruta) 
			bos.write(buffer);//Escribimos de una tacada 32Kb
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			if (bos != null)
				try {
					bos.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
		}
		
		

	}

}
