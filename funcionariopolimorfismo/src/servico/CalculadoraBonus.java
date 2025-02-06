package servico;

import dominio.Funcionario;
import dominio.Vendedor;

public class CalculadoraBonus {
	
	public static void calculadoraBonus(Funcionario funcionario) {
		System.out.println("Relatório funcionário: ");
		double bonus = funcionario.calcularBonus();
		System.out.println("Nome do funcionário: "+funcionario.getNome());
		System.out.println("Salário: "+funcionario.getSalario());
		System.out.println("Cargo: "+funcionario.getSetor());
		System.out.println("Bonus: "+bonus);
		if(funcionario instanceof Vendedor) {
			Vendedor vendedor = (Vendedor) funcionario;
			System.out.println("Vendas por mês: "+vendedor.getVendasMes());
		}
	}
	
}
