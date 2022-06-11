
public class Caixa {
	private int altura, largura, profundidade;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
	public String cabeDentro(int diametro) {
		if (diametro <= largura && diametro <= altura && diametro <= profundidade) {
			return  "Sim";
		}
		return "Nao";
	}
}
