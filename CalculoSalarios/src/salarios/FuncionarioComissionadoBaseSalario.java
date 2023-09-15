package salarios;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
	private double salario;
	
	
	
	public FuncionarioComissionadoBaseSalario(String nome, String CPF, double taxaComissao, double vendasBrutas,
			double salario) {
		super(nome, CPF, taxaComissao, vendasBrutas);
		this.setSalario(salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double getRendimentos() {
		
		return this.getTaxaComissao() * this.getVendasBrutas();
	}
}
