package entities;


import entities.Pedido;
import entities.Produto;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilaPedidosTest {

	private FilaPedidos filaPedidos;
	private Pedido ped1;
	
	@BeforeEach
	void setUp() throws Exception {
		filaPedidos = new FilaPedidos();
		ped1 = new Pedido();
		Produto p1 = new Produto("Maca", 12.25f);
		Pedido ped2 = new Pedido();
		Produto p2 = new Produto("Banana", 13.30f);
		ped1.addProduto(p1);
		ped2.addProduto(p2);
		filaPedidos.addPedido(ped1);
		filaPedidos.addPedido(ped2);

	}

	@Test
	void filaPedidosVaziaTest() {
		filaPedidos.saiPedido();
		filaPedidos.saiPedido();
		String expAns = "Não há produtos na fila ainda!";
		String ans = filaPedidos.saiPedido();
		assertEquals(expAns, ans);
	}
	
	@Test
	void saiPedidoTest() {
		String expAns = "Pedido com os produtos:[Maca], com o preço total: R$12.25 saiu!";
		String ans = filaPedidos.saiPedido();

		assertEquals(expAns, ans);
	}
	
	@Test
	void addPedidoTest() {
		String expAns = "Pedido com os produtos:[Maca], com o preço total: R$12.25 entrou na fila!";
		String ans = filaPedidos.addPedido(ped1);

		assertEquals(expAns, ans);
	}

}
