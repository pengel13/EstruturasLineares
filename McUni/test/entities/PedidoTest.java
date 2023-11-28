package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoTest {
	private Pedido p1;
	@BeforeEach
	void setUp() throws Exception {
		
		Produto prod1 = new Produto("Maca", 25.0f);
		Produto prod2 = new Produto("Banana", 30.0f);
		Produto prod3 = new Produto("Suco", 3.0f);
		ArrayList<Produto> produtos =  new ArrayList<Produto>();
		produtos.add(prod3);
		produtos.add(prod2);
		produtos.add(prod1);
		p1 = new Pedido();
		p1.setProdutos(produtos);
	}

	@Test
	void checaPrecoTotal() {
		float expans = 58.0f;
		float ans = p1.getPrecoTotal();
		assertEquals(expans, ans);
	}

}
