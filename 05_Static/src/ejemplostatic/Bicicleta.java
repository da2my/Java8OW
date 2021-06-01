package ejemplostatic;

public class Bicicleta {

	private int numMarchas;
	private int diametroRueda;
	private int velocidad;
	private int id;

	// Variable est�tica
	// Compartida para todas las instancias que podamos crear de Bicicleta.
	private static int numeroDeBiciletas = 0;

	public static int getNumeroDeBicicletas() {
		// Una variable estatica puede ser accedida a traves de metodos staticos.
		// No podemos usar this, un metodo estatico no tienen acceso al punteto this
		// porque this sera una referencia a la propia instacia del objeto
		// return this.numeroDeBiciletas;
		return numeroDeBiciletas;
	}

	public Bicicleta(int numMarchas, int diametroRueda, int velocidad) {
		this.numMarchas = numMarchas;
		this.diametroRueda = diametroRueda;
		this.velocidad = velocidad;
		id = ++numeroDeBiciletas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getDiametroRueda() {
		return diametroRueda;
	}

	public void setDiametroRueda(int diametroRueda) {
		this.diametroRueda = diametroRueda;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
