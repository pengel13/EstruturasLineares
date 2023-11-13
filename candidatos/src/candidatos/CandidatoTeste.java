package candidatos;

import java.util.Comparator;
import java.lang.reflect.Array;
import java.util.*;
import java.util.PriorityQueue;

public class CandidatoTeste {

	public static void main(String[] args) {
		Comparator<Candidato> comparaIdade = new CandidatoComparaIdade();
		PriorityQueue<Candidato> OrdenadoIdade = new PriorityQueue<Candidato>(10, comparaIdade);
//		Candidato[] ListaCandidatos = new Candidato();
		Candidato c1 = new Candidato("Guilherme Lacerda", "GFBPA", 15, 200);
		Candidato c2 = new Candidato("Arthur Kellerman", "KEKA", 20, 201);
		Candidato c3 = new Candidato("Pedro Engel", "PSOL", 10, 289);
		Candidato c4 = new Candidato("Lorenzo Kisrt", "PT", 19, 300);
		OrdenadoIdade.add(c1);
		OrdenadoIdade.add(c2);
		OrdenadoIdade.add(c3);
		OrdenadoIdade.add(c4);

		
		System.out.println(pegaMaisVelho(OrdenadoIdade));
		OrdenadoIdade.add(c1);
		OrdenadoIdade.add(c2);
		OrdenadoIdade.add(c3);
		OrdenadoIdade.add(c4);
		System.out.println(pegaMaisNovo(OrdenadoIdade));
	}

	public static Candidato pegaMaisNovo(PriorityQueue<Candidato> listaCandidatos) {
		Candidato candidatoMaisNovo = new Candidato();
		int fullSize = listaCandidatos.size();
		
		while (!listaCandidatos.isEmpty()) {
			
			if (listaCandidatos.size() == fullSize) {
				candidatoMaisNovo = listaCandidatos.poll();
			}
			listaCandidatos.poll();
		}
		return candidatoMaisNovo;
	}
	
	public static Candidato pegaMaisVelho(PriorityQueue<Candidato> listaCandidatos) {
		Candidato candidatoMaisVelho = new Candidato();
		while (!listaCandidatos.isEmpty()) {
			if (listaCandidatos.size() == 1) {
				candidatoMaisVelho = listaCandidatos.poll();
				break;
			}
			listaCandidatos.poll();
		}
		return candidatoMaisVelho;
	}
}
