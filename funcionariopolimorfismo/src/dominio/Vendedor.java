package dominio;

public class Vendedor extends Funcionario {
	public static final double BONUS_POR_CENTO = 0.15;
	private int vendasMes;

	public Vendedor(String nome, double salario, String setor) {
		super(nome, salario, setor);
	}

	@Override
	public double calcularBonus() {
		System.out.println("Calculando bonus do vendedor... ");
		return salario * BONUS_POR_CENTO;
	}

	public int getVendasMes() {
		return vendasMes;
	}

	public void setVendasMes(int vendasMes) {
		this.vendasMes = vendasMes;
	}

	public static double getBonusPorCento() {
		return BONUS_POR_CENTO;
	}
}
