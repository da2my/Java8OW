package ejemploabstractinterfaces;

public abstract class ObjectoGrafico implements Transformable {// Como se puede apreciar, ObjectoGrafico implementa a
																// Transformable pero por el hecho de ser una clase
																// abstrac no nos esta obligando a que le demos cuerpo a
																// la implementacion. Si puntualmente quitaramos
																// "abstract" veriamos como nos obligaria a añadir los
																// metodos no implementados de Transformable. Sin
																// embargo por el hecho de ser una clase abstract
																// permite que eso se delege en la clase Circulo que
																// extends de ObjetoGrafico

	protected int x, y;

	public void moverA(int nuevaX, int nuevaY) {
		this.x = nuevaX;
		this.y = nuevaY;
	}

	abstract public void dibujar();

	abstract public void cambiarTamanio(int factorAumento);

}
