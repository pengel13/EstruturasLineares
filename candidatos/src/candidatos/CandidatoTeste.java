package candidatos;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CandidatoTeste {

	public static void main(String[] args) {
		Comparator<Candidato> comparaIdade = new CandidatoComparaIdade();
		PriorityQueue<Candidato> OrdenadoIdade = new PriorityQueue<Candidato>();
		OrdenadoIdade.add(new Candidato("Pedro Engel","PSOL", 18, 289 ));
		
	}

}
