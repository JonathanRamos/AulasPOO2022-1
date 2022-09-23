
public class Pessoa {
	private String nome;
	private int idade;
	private double salarioMensal;
	@SuppressWarnings("unused")
	private double salarioAnual;
	
	
	/*
	 * EXEMPLOS DE CONSTRUTORES COM PARAMETROS DIFERENTES
	 * 
	 */
	public Pessoa() {
		// construtor vazio
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	/*
	 * EXEMPLO DE GETTERS E SETTERS
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	/**
	 * <p><b>Irá definir o salário anual baseado no salário mensal</b></p>
	 * @param sMensal é o salário da pessoa por mês 
	 * @return outro param que não temos....
	 * @see internet link here or link to other function
	 */
	public void setSalarioMensal(double sMensal) {
		this.salarioMensal = sMensal;
		this.calcularSalarioAnual();
	}
	
	public double getSalarioMensal() {
		return this.salarioMensal;
	}
	
	public double getSalarioAnual() {
		return this.salarioMensal;
	}
	
	// Somente a classe pessoa pode alterar o salario anual.
	private void setSalarioAnual(double sAnual) {
		this.salarioMensal = sAnual;
	}
	
	private void calcularSalarioAnual() {
		double valorCalculado = salarioMensal*12;
		this.setSalarioAnual(valorCalculado);
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() +
				" Idade: " + this.getIdade() + 
				" Salario Mensal: " + this.getSalarioMensal() + 
				" Salario Anual: " + this.getSalarioAnual();
	}
}
