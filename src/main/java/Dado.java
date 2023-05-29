public class Dado {

	private int cara;


	public int lanzarDado() {
		int numero = (int)(Math.random()*(6-1+1)+1);
		return numero;

	}

}