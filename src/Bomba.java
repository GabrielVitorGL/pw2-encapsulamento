
public class Bomba {
	private int pressaoLida;
	private int pressaoDesejada;
	
	public int obterResultado() {
		return pressaoDesejada - pressaoLida;
	}

	public int getPressaoLida() {
		return pressaoLida;
	}

	public void setPressaoLida(int pressaoLida) {
		this.pressaoLida = pressaoLida;
	}

	public int getPressaoDesejada() {
		return pressaoDesejada;
	}

	public void setPressaoDesejada(int pressaoDesejada) {
		this.pressaoDesejada = pressaoDesejada;
	}

	
}
