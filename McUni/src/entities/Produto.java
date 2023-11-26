package entities;

public class Produto {
	private String nome;
	private float preco;
	
	public Produto() {}
	
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public boolean setPreco(float preco) {
		if (preco > 0 ) {
			this.preco = preco;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return  nome;
	}
	
}
