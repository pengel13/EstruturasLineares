package entities;

import java.util.ArrayList;

public class Pedido {
	ArrayList<Produto> produtos = new ArrayList<>();
	private float precoTotal;
	public Pedido() {}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public float getPrecoTotal() {
		this.setPrecoTotal();
		return precoTotal;
	}
	public void setPrecoTotal() {
		this.precoTotal = 0;
		for (Produto p : produtos) {
			this.precoTotal += p.getPreco();
		}
	}
	@Override
	public String toString() {
		return "Pedido com os produtos:" + produtos.toString() + ", com o preço total: R$" + this.getPrecoTotal();
	}
	
}
