package candidatos;
import candidatos.CandidatoTeste;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComparadorIdadeTest {
	private Candidato c1;
	private Candidato c2;
	private Candidato c3;
	private PriorityQueue<Candidato> listaOrdenada;
	@BeforeEach
	void setUp() {
		try {
			c1 = new Candidato("Pedro Engel", "PT", 18, 20);
			c2 = new Candidato("Lorenzo Kirst", "PSOL", 25, 200);
			c3 = new Candidato("Arthur Kellermann", "PCD", 26, 350);
			Candidato[] candidatos = {c1, c2, c3};
			Comparator<Candidato> comparaIdade = new CandidatoComparaIdade();
			listaOrdenada = new PriorityQueue<Candidato>(3, comparaIdade);
			for (Candidato c : candidatos) {
				listaOrdenada.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void acharMaisNovoTest() {
		String expAns = c1.getNome() + c3.getNome();
		Candidato[] candidatos = CandidatoTeste.pegaMenorMaior(listaOrdenada);
		String ans = candidatos[0].getNome() + candidatos[1].getNome();
		assertEquals(expAns, ans);
	}
	


}
