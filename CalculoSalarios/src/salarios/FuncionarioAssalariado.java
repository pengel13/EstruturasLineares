package salarios;

public class FuncionarioAssalariado extends Funcionario{
	private double salario;
	
	public FuncionarioAssalariado() {
		super();
	}
	
	public FuncionarioAssalariado(String nome, String cpf, double salario) {
		super(nome, cpf);
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
		
		return this.getSalario();
	}

}
