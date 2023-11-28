package candidatos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CandidatoTest {
	private Candidato c1;
	@BeforeEach
	void setUp(){
		c1 = new Candidato();
		
	}

	@Test
	void testValidaIdadeFalse() {
		boolean expAns = false;
		boolean ans = c1.validaIdade(15);
		assertEquals(expAns, ans);
	}
	
	@Test
	void testValidaIdadeTrue() {
		boolean expAns = true;
		boolean ans = c1.validaIdade(25);
		assertEquals(expAns, ans);
	}
	
	@Test
	void testValidaVotosFalse() {
		boolean expAns = false;
		boolean ans = c1.validaNDeVotos(-25);
		assertEquals(expAns, ans);
	}
	
	@Test
	void testValidaVotosTrue() {
		boolean expAns = true;
		boolean ans = c1.validaNDeVotos(25);
		assertEquals(expAns, ans);
	}

}
