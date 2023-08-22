package contatos;

public class Agenda {
	private static final int MAXIMO_ELEMENTOS = 10;
	private Contato[] agenda;
	private int numeroElementos = 0;

	public Agenda() {
		agenda = new Contato[MAXIMO_ELEMENTOS];
		numeroElementos = 0;
	}

	public boolean adiciona(Contato contato) {
		if (numeroElementos >= 0 && numeroElementos < MAXIMO_ELEMENTOS) {
			agenda[numeroElementos] = contato;
			numeroElementos++;	
			return true;
		}
		return false;
	}

	public Contato[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contato[] agenda) {
		this.agenda = agenda;
	}

	public int getNumeroElementos() {
		return numeroElementos;
	}

	public void setNumeroElementos(int numeroElementos) {
		this.numeroElementos = numeroElementos;
	}
	
	public Contato busca(int posicao) {
		return agenda[posicao];
	}
	
	
}
