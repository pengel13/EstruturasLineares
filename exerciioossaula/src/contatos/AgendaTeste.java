package contatos;

import contatos.Contato;

public class AgendaTeste {

	public static void main(String[] args) {
		Contato c1 = new Contato("Pedro Engel", "(51) 984028208", "pedrototiengel@gmail.com", TipoContato.PESSOAL);
		Contato c2 = new Contato("Arthur Keka", "(51) 989898524", "kellermana@gmail.com", TipoContato.PROFISSIONAL);
		Contato c3 = new Contato("Suarez", "(51) 9999999999", "luisito@gmail.com", TipoContato.PROFISSIONAL);
		Contato c4 = new Contato("Bagrencia", "(51) 000000000", "negge@gmail.com", TipoContato.PROFISSIONAL);

		Agenda a1 = new Agenda();
		a1.adicionaContato(c2);
//		a1.adicionaContato(c1, 0);  
		a1.adicionaContato(c3, 1);
		a1.adicionaContato(c4, 2);
		
	
		Contato[] lista = a1.getAgenda();

		Contato contConsultado = a1.busca(2);
		
		
//		exibeInfo(contConsultado);
		
//		mostraAgenda(lista);
		
		if (a1.removerContato(c2)) {
			System.out.println("Contato Removido");
		}
		else {
			System.out.println("Contato Removido");
		
		}
		
		System.out.println("Posicao do contato: " + a1.consultaPosicao(c1));
		mostraAgenda(lista)
		;
	}

	private static void mostraAgenda(Contato[] lista) {
		for (int index = 0; index < lista.length; index++) {
			Contato c = lista[index];
			if (c != null) {
				exibeInfo(c);
			}
		}
	}

	private static void exibeInfo(Contato c) {
		System.out.println("Nome:" + c.getNome());
		System.out.println("Fone:" + c.getFone());
		System.out.println("Email:" + c.getEmail());
		System.out.println("Tipo de contato:" + c.getTipo().toString());
	}

}
