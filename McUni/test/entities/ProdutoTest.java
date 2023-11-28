package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest {
	private Produto p1;

	@BeforeEach
	void setUp() throws Exception {
		p1 = new Produto();

	}

	@Test
	void validaPrecoTest() {
		boolean expans = true;
		boolean ans = p1.setPreco(20.0f);
		assertEquals(expans, ans);
	}

}
