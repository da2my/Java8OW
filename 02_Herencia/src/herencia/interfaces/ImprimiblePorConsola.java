package herencia.interfaces;

public interface ImprimiblePorConsola extends Imprimible {//interface ImprimiblePorConsola que extiende a Imprimible, que hereda de Imprimible
	
	default public void printConsola(String s) {//este medoto esta implementado por default
		System.out.println(s);
	}
	

}
