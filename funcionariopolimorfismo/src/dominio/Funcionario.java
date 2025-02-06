package dominio;

public abstract class Funcionario implements Bonus{
	protected String nome;
	protected double salario;
	protected String setor;
	
	public Funcionario(String nome, double salario, String setor) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}
