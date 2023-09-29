package salarios;

public abstract class Funcionario {
	private String nome;
	private String CPF;
	private char Genero;
	private boolean GeneroIsValid;
	private boolean CpfIsValid;
	public Funcionario() {
	}

	public Funcionario(String nome, String cPF, char Genero) {
		if (CpfIsValid && GeneroIsValid){
			this.setCPF(cPF);
			this.setGenero(Genero);
		}


	}

	public char getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		try {
			if (genero != 'F' && genero != 'M') {
				GeneroIsValid = false;
				throw new AppException("GÊNERO INVÁLIDO");
			}
			
		} catch (AppException e) {
			System.err.println(e);
		}
		GeneroIsValid = true;
		this.
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

	public boolean setCPF(String cPF) {
		try {
			if (cPF.length() != 11) {

				throw new AppException("CPF INVÁLIDO");

			}
			this.CPF = cPF;
			return true;
		} catch (AppException e) {
			e.printStackTrace();
		}
		return false;

	}
}
