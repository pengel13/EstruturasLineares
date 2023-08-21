package contatos;

public class Agenda {
	private Contato[] agenda;
	private int numeroElementos = 0;

	public Agenda() {
		agenda = new Contato[10];
		numeroElementos = 0;
	}

	public void adiciona(Contato contato) {
		agenda[numeroElementos] = contato;
	}
}
