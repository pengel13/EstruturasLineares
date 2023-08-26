package contatos;

public class Agenda {
	private static final int MAXIMO_ELEMENTOS = 10;
	private static final int posicao_INVALIDA = -1;
	private Contato[] agenda;
	private int numeroElementos = 0;

	public Agenda() {
		agenda = new Contato[MAXIMO_ELEMENTOS];
		numeroElementos = 0;
	}

	public boolean adicionaContato(Contato contato) {
		if (numeroElementos == agenda.length)
			return false;

		agenda[numeroElementos] = contato;
		numeroElementos++;
		return true;
	}

	public boolean adicionaContato(Contato contato, int posicao) {
		
		if (posicao < 0 || numeroElementos == MAXIMO_ELEMENTOS || agenda[posicao] != null
				|| posicao >= MAXIMO_ELEMENTOS)
			return false;

		agenda[posicao] = contato;
		numeroElementos++;
		return true;
	}

	public boolean removerContato(int posicao) {
		if (agenda[posicao] == null || posicao >= agenda.length || posicao < 0)
			return false;

		agenda[posicao] = null;
		numeroElementos--;
		return true;
	}

	public boolean removerContato(Contato contato) {
		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i] == contato) {
				agenda[i] = null;
				numeroElementos--;
				return true;
			}
		}
		return false;

	}
	
	public int consultaPosicao(Contato contato) {
		for (int i = 0; i < agenda.length; i++) {
			if (contato != null && agenda[i] == contato) {
				return i;
			}
		}
		return posicao_INVALIDA;

	}

	public Contato consultaContato(int posicao) {
		if (posicao >= 0 && posicao < agenda.length) {
			return agenda[posicao];
		}
		return null;
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
