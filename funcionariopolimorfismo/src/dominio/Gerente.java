package dominio;

public class Gerente extends Funcionario {
	public static final double BONUS_POR_CENTO = 0.1;

	public Gerente(String nome, double salario, String setor) {
		super(nome, salario, setor);
	}
	
	@Override
	public double calcularBonus() {
		System.out.println("Calculando bonus gerente...");
		return salario * BONUS_POR_CENTO;
	}
	
}
