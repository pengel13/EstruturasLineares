package candidatos;

public class Candidato {
	private String nome;
	private String partidoPolitico;
	private int idade;
	private int nDeVotos;

	public Candidato () {}

	public Candidato(String nome, String partidoPolitico, int idade, int nDeVotos) throws Exception {
		if(validaIdade(idade) && validaNDeVotos(nDeVotos)) {
			this.nome = nome;
			this.partidoPolitico = partidoPolitico;
			this.idade = idade;
			this.nDeVotos = nDeVotos;
		}
		else {
			throw new Exception("Candidato Inválido.");
			}
		}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartidoPolitico() {
		return partidoPolitico;
	}

	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getnDeVotos() {
		return nDeVotos;
	}

	public void setnDeVotos(int nDeVotos) {
		this.nDeVotos = nDeVotos;
	}
	
	public boolean validaIdade(int idade) {
		if(idade < 18) {
			return false;
		}
		return true;
	}
	public boolean validaNDeVotos(int nVotos) {
		if (nVotos<0) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Candidato (nome=" + nome + ", partido Político=" + partidoPolitico + ", idade=" + idade
				+ "anos, número de votos=" + nDeVotos + "]";
	}

}
