package filmeSeriado;

public class ListaFilmes {
	private static int maximoFilmes = 10;
	private int numeroFilmes;
	private Filme[] listaFilmes;
	
	public ListaFilmes(int tamanho){
		listaFilmes = new Filme[tamanho];
		maximoFilmes = tamanho;
		numeroFilmes = 0;
	}
	
	public ListaFilmes() {
		this(maximoFilmes);
	}
	
	public boolean adicionaFilme(Filme filme) {
		if (checaCodigo(filme.getCodigo())) {
			listaFilmes[numeroFilmes] = filme;
			numeroFilmes ++;
			return true;
		}
		return false;
		
	}
	
	public boolean adicionaFilme(Filme filme, int posicao) {
		if (checaCodigo(filme.getCodigo()) && checaPosicao(posicao)) {
			listaFilmes[numeroFilmes] = filme;
			numeroFilmes ++;
			return true;
		}
		return false;
		
	}
	
	public boolean checaCodigo(int codigo) {
		for (int i = 0; i <numeroFilmes ; i++) {
			if (listaFilmes[i].getCodigo() == codigo) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checaPosicao(int posicao) {
		if (posicao >= maximoFilmes || listaFilmes != null || numeroFilmes == maximoFilmes || posicao <0) {
			return false;
		}
		return true;
	}

	public static int getMaximoFilmes() {
		return maximoFilmes;
	}

	public static void setMaximoFilmes(int maximoFilmes) {
		ListaFilmes.maximoFilmes = maximoFilmes;
	}

	public int getNumeroFilmes() {
		return numeroFilmes;
	}

	public void setNumeroFilmes(int numeroFilmes) {
		this.numeroFilmes = numeroFilmes;
	}

	public Filme[] getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(Filme[] listaFilmes) {
		this.listaFilmes = listaFilmes;
	}
	
}
