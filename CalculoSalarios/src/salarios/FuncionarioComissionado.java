package salarios;

public class FuncionarioComissionado extends Funcionario {
	

	private double taxaComissao;
	private double vendasBrutas;

	public FuncionarioComissionado(String nome, String CPF, double taxaComissao, double vendasBrutas) {
		super(nome, CPF);
		this.taxaComissao = taxaComissao;
		this.vendasBrutas = vendasBrutas;
	}

	public FuncionarioComissionado() {
		super();
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	@Override
	public double getRendimentos() {
		
		return this.getTaxaComissao() * this.getVendasBrutas();
	}

}
