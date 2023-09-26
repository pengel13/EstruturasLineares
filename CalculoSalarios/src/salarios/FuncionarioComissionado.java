package salarios;

public class FuncionarioComissionado extends Funcionario {

	private double taxaComissao;
	private double vendasBrutas;

	public FuncionarioComissionado(String nome, String CPF, char Genero, double taxaComissao, double vendasBrutas) {
		super(nome, CPF, Genero);
		this.setTaxaComissao(taxaComissao);
		this.setVendasBrutas(vendasBrutas);
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
