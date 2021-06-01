/**
 * 
 */
package enumeraciones.basico;

/**
 * @author Openwebinars
 *
 */
public class EjemploEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		saludaSegunDia(DiaSemana.LUNES);
		saludaSegunDia(DiaSemana.MIERCOLES);
		saludaSegunDia(DiaSemana.VIERNES);
		saludaSegunDia(DiaSemana.SABADO);
		

	}

	public static void saludaSegunDia(DiaSemana d) {//Recibe un dia de la semana de tipo enum
		switch (d) {
		case LUNES:
			System.out.println("Los lunes son duros :(");
			break;
		
		case VIERNES:
			System.out.println("Los viernes son mejores :)");
			break;
			
		case SABADO: case DOMINGO:
			System.out.println("Los findes son los mejores dias :)))");
			break;
			
		default:
			System.out.println("El resto de dias son fifty-fifty");
			break;

		}
	}
}
