package salarios;

public abstract class Funcionario {
	public Funcionario () {}
	
	public Funcionario(String nome, String cPF) {
		this.nome = nome;
		this.CPF = cPF;
	}

	private String nome;
	private String CPF;
	
	public abstract double getRendimentos();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
