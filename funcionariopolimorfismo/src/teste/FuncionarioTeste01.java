package teste;

import dominio.Funcionario;
import dominio.Gerente;
import dominio.Vendedor;
import servico.CalculadoraBonus;

public class FuncionarioTeste01 {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("Goku", 2000.00, "Vendas");
		vendedor.setVendasMes(50);
		Funcionario funcionario2 = new Gerente("Vegeta", 5000.00, "Administração");
		
		CalculadoraBonus.calculadoraBonus(vendedor);
		System.out.println("-------------------------");
		CalculadoraBonus.calculadoraBonus(funcionario2);
	}

}
