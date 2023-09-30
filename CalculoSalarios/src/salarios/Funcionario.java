package salarios;

public abstract class Funcionario {
	private String nome;
	private String CPF;
	private char Genero;

	public Funcionario() {
	}

	public Funcionario(String nome, String cPF, char Genero) {
		if (validaGenero(Genero) && validaCpf(cPF)) {
			this.setNome(nome);
			this.setCPF(cPF);
			this.setGenero(Genero);
		}

	}

	public char getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		this.Genero = genero;
	}

	public boolean validaGenero(char genero) {
		try {
			if (genero != 'F' && genero != 'M') {
				throw new AppException("GÊNERO INVÁLIDO");
			}
			return true;
		} catch (AppException e) {
			System.err.println(e);
			//System.err.println(e.getCause());
			return false;
		}
		
	}

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
		this.CPF = cPF;
	}

	public boolean validaCpf(String cpf) {
		try {
			if (cpf.length() != 11) {
				throw new AppException("CPF INVÁLIDO");
			}
			return true;
		} catch (AppException e) {
			e.printStackTrace();
			//System.err.println(e.getCause());
			return false;
		}

	}

}
