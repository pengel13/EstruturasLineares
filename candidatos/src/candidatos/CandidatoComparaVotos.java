package candidatos;

import java.util.Comparator;

public class CandidatoComparaVotos implements Comparator<Candidato>{

	public int compare(Candidato c1, Candidato c2) {
		if (c1.getnDeVotos() < c2.getnDeVotos()) {
			
			return -1;
		}
		if (c1.getnDeVotos() > c2.getnDeVotos()) {
			return 1;
		}
		return 0;
	}

}
