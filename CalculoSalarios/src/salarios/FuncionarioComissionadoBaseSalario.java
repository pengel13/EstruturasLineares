package salarios;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
	private double salario;

	public FuncionarioComissionadoBaseSalario(String nome, String CPF, char Genero, double taxaComissao, double vendasBrutas,
			double salario) {
		super(nome, CPF, Genero, taxaComissao, vendasBrutas);
		this.setSalario(salario);
	}
	
	public FuncionarioComissionadoBaseSalario() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double getRendimentos() {

		return this.getSalario() + this.getTaxaComissao() * this.getVendasBrutas();
	}
}
