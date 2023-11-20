package entities;

public class Produto {
	private String nome;
	private float preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		if (preco > 0 ) {
			
		}
		this.preco = preco;
	}
}
