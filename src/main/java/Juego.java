import java.util.EventListener;

public class Juego {

	private Dado d1;
	private Dado d2;

	public Juego(Dado d1, Dado d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	public Dado getD1() {
		return d1;
	}

	public Dado getD2() {
		return d2;
	}

	public int sumaDados(int num1, int num2) {
		return num1+num2;

	}

	public String resultado(int n) {
		if (n == 7){
			return "GANASTE";
		}else {
			return "PERDISTE";
		}
	}



}