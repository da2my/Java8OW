/**
 * 
 */
package bytes.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Openwebinars
 *
 */
public class CopyBytes {

  /**
   * @param args
   */
  // Con este programa podemos copiar cualquier tipo de fichero binario como .pdf,
  // .exe, ect...
  public static void main(String[] args) {// esta escrita la forma para que recoja el fichero con args tambien

    if (args.length != 2) {//si la cantidad de args q tenemos que recibir es diferent a 2, o sea fich de entrad y fich de salida
      System.err.println("Error de sintaxis. Se necesitan dos argumentos");
      return;
    }

    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;

    final int TAM = 1024 * 16;//tamaño de 16kb

    try {
      // bin = new BufferedInputStream(new FileInputStream("openwebinars.jpg"));
      // bout = new BufferedOutputStream(new FileOutputStream("image_copy.jpg"));
      bin = new BufferedInputStream(new FileInputStream(args[0]));
      bout = new BufferedOutputStream(new FileOutputStream(args[1]));

      int cantidadBytes = 0;
      byte[] buffer = new byte[TAM];

      //leo y copio a la vez...
      while ((cantidadBytes = bin.read(buffer, 0, TAM)) != -1) {//read(queremos leer en buffer, poner offset(0) y una longuitud(TAM))
        bout.write(buffer, 0, cantidadBytes);
      }

      System.out.println("El fichero se ha copiado correctamente");

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bin != null)
        try {
          bin.close();//cierra bin
        } catch (IOException e) {
          e.printStackTrace();
        }
      if (bout != null)
        try {
          bout.close();//cierra bout
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

  }

}
