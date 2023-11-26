package candidatos;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CandidatoTeste {

	public static void main(String[] args) throws Exception {
		
		int resp = 0;
		while (resp!=7) {
			resp = mostraMenu();
			mostraResposta(resp);
		}
		
	}

	public static int mostraMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("BEM VINDO AO PORTAL DOS CANDIDATOS");
		System.out.println("-------------");
		System.out.println(
				"Digite o que você quer buscar: \n1) Candidato mais jovem \n2) Candidato mais velho \n3) Candidato mais votado \n4) Candidato menos votado \n5) Total de Votos \n6) Média de votos por candidato \n7) Sair");
		return scanner.nextInt();
	}

	public static void mostraResposta(int resposta) throws Exception {
		Comparator<Candidato> comparaIdade = new CandidatoComparaIdade();
		Comparator<Candidato> comparaVoto = new CandidatoComparaVotos();
		Candidato[] candidatos = criaCandidatos();
		PriorityQueue<Candidato> OrdenadoIdade = adicionaCandidatos(candidatos, comparaIdade);
		PriorityQueue<Candidato> OrdenadoVotos = adicionaCandidatos(candidatos, comparaVoto);
		Candidato[] candidatosIdade = pegaMenorMaior(OrdenadoIdade);
		Candidato[] candidatosVotos = pegaMenorMaior(OrdenadoVotos);
		switch(resposta) {
		case 1:
			mostraMaisNovo(candidatosIdade);
			break;
		case 2:
			mostraMaisVelho(candidatosIdade);
			break;
		case 3: 
			mostraMaisVotado(candidatosVotos);
			break;
		case 4: 
			mostraMenosVotado(candidatosVotos);
			break;
		
		case 5:
			System.out.println("O total de votos foi de " + totalVotos(candidatos));
			break;
		case 6:
			System.out.println("A média de votos foi de " + mediaVotos(candidatos));
			break;
		case 7:
			System.out.println("Saindo....");
			break;
		default:
			System.out.println("Número inválido. Digite Novamente.");
		}
	}
	
	public static Candidato[] criaCandidatos() throws Exception {
		Candidato c1 = new Candidato("Guilherme Lacerda", "PLDB", 18, 200);
		Candidato c2 = new Candidato("Arthur Kellerman", "PDTB", 20, 201);
		Candidato c3 = new Candidato("Pedro Engel", "GFBA", 109, 289);
		Candidato c4 = new Candidato("Lucas Engel", "PCDB", 19, 635);
		Candidato c5 = new Candidato("Luis Engel", "PCDB", 55, 210);
		Candidato c6 = new Candidato("Elis Engel", "PT", 52, 963);
		Candidato c7 = new Candidato("Renato Spohr", "PSOL", 85, 211);
		Candidato c8 = new Candidato("Pedro Geromel", "GFBA", 38, 1552);
		Candidato c9 = new Candidato("Rhuan Santos", "PT", 22, 111);
		Candidato c10 = new Candidato("Solano Santos", "ULB", 26, 99);
		Candidato[] candidatos = { c1, c2, c3, c4, c5, c6, c7, c8, c9, c10 };
		return candidatos;
	}

	public static PriorityQueue<Candidato> adicionaCandidatos(Candidato[] candidatos, Comparator comparador) {
		PriorityQueue<Candidato> listaOrdenada = new PriorityQueue<Candidato>(10, comparador);
		for (Candidato c : candidatos) {
			listaOrdenada.add(c);
		}
		return listaOrdenada;
	}

	public static Candidato[] pegaMenorMaior(PriorityQueue<Candidato> listaCandidatos) {
		Candidato candidatoMenor = new Candidato();
		Candidato candidatoMaior = new Candidato();
		int fullSize = listaCandidatos.size();

		while (!listaCandidatos.isEmpty()) {
			if (listaCandidatos.size() == 1) {
				candidatoMaior = listaCandidatos.poll();
				break;
			}
			if (listaCandidatos.size() == fullSize) {
				candidatoMenor = listaCandidatos.poll();
			}
			listaCandidatos.poll();
		}
		Candidato[] candidatos = { candidatoMenor, candidatoMaior };
		return candidatos;
	}

	public static void mostraMaisNovo(Candidato[] candidatos) {
		Candidato cNovo = candidatos[0];
		System.out.println("O candidato mais novo é " + cNovo.getNome() + " do partido " + cNovo.getPartidoPolitico()
				+ " com " + cNovo.getIdade() + " anos de idade.");
	}

	public static void mostraMaisVelho(Candidato[] candidatos) {
		Candidato cVelho = candidatos[1];
		System.out.println("O candidato mais velho é " + cVelho.getNome() + " do partido " + cVelho.getPartidoPolitico()
				+ " com " + cVelho.getIdade() + " anos de idade.");
	}

	public static void mostraMenosVotado(Candidato[] candidatos) {
		Candidato cVotado = candidatos[0];
		System.out.println("O candidato menos votado é " + cVotado.getNome() + " do partido "
				+ cVotado.getPartidoPolitico() + " com " + cVotado.getnDeVotos() + " votos recebidos.");
	}

	public static void mostraMaisVotado(Candidato[] candidatos) {
		Candidato cVotado = candidatos[1];
		System.out.println("O candidato mais votado é " + cVotado.getNome() + " do partido "
				+ cVotado.getPartidoPolitico() + " com " + cVotado.getnDeVotos() + " votos recebidos.");
	}

	public static int totalVotos(Candidato[] candidatos) {
		int soma = 0;
		for (Candidato c : candidatos) {
			soma += c.getnDeVotos();
		}
		return soma;
	}

	public static int mediaVotos(Candidato[] candidatos) {
		int size = candidatos.length;
		int soma = totalVotos(candidatos);
		return Math.round(soma / size);

	}
}
