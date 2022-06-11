
public class TestaCaixa {
	public static void main(String[] args) {
		int diametro;
		
		Caixa caixa = new Caixa();
		
		diametro = 9;
		caixa.setAltura(15);
		caixa.setLargura(9);
		caixa.setProfundidade(10);
		
		System.out.println(caixa.cabeDentro(diametro));
		
	}
}
