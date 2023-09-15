package salarios;

public class FuncionarioHorista extends Funcionario{
	private double horasTrabalhadas;
	private double salarioHora;
	
	public FuncionarioHorista(String nome, String cPF, double salarioHora, double horasTrabalhada) {
		super(nome, cPF);
		this.setHorasTrabalhadas(horasTrabalhada);
		this.setSalarioHora(salarioHora);
	}
	
	public FuncionarioHorista() {
		super();
	}
	
	@Override
	public double getRendimentos() {
		double rendimento;
		if (this.getHorasTrabalhadas()<=40)
		{
			rendimento =  this.getHorasTrabalhadas() * this.getSalarioHora();
		}
		else
		{
			rendimento = this.getSalarioHora() * 40;
			rendimento += (this.getHorasTrabalhadas() - 40) * this.getSalarioHora() * 1.5;
		}
		return rendimento;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

}
