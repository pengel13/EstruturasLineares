package filmeSeriado;

public class Filme {
	private int codigo;
	private int ano;
	private String titulo;
	private String diretor;
	private String atores;
	private TipoVideo tipo;
	
	public Filme() {}
	
	public Filme(int codigo, int ano, String titulo, String diretor, String atores, TipoVideo tipo) {
		this.setCodigo(codigo);
		this.setAno(ano);
		this.setTitulo(titulo);
		this.setAtores(atores);
		this.setTipo(tipo);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

	public TipoVideo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVideo tipo) {
		this.tipo = tipo;
	}
}
