/*
 * Ejemplo de clase abstracta
 */
package ejemploabstract;


/**
 * @author Openwebinars
 *
 */
public abstract class ObjectoGrafico  {
	
	protected int x, y;
	
	public void moverA(int nuevaX, int nuevaY) {//Con implementacion
		this.x = nuevaX;
		this.y = nuevaY;
	}
	
	abstract public void dibujar();//Sin implementacion. Se les tiene que dar implementacion, no necesariamente aqui
	
	abstract public void cambiarTamanio(int factorAumento);//Sin implementacion. Se les tiene que dar implementacion, no necesariamente aqui

}
