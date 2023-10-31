package candidatos;

import java.util.Comparator;

public class CandidatoComparaIdade implements Comparator<Candidato>{

	public int compare(Candidato c1, Candidato c2) {
		if (c1.getIdade() < c2.getIdade()) {
			return -1;
		}
		if (c1.getIdade() > c2.getIdade()) {
			return 1;
		}
		return 0;
	}

}
