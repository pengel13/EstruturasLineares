package testes;

import rh.ControleBonificacoes;
import rh.Funcionario;
import rh.Gerente;
import rh.Operador;

public class ControleBonificacoesTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Maria", "0293023232", 15000);
		Funcionario f2 = new Operador("Jorge", "394384933", 20000);
		Funcionario f3 = new Gerente("Sandro", "432434343", 10000);
		Funcionario f4 = new Operador("Paulo", "348939483943", 2000);
		
		ControleBonificacoes cb = new ControleBonificacoes();
		cb.registraBonificacao(f1);
		cb.registraBonificacao(f2);
		cb.registraBonificacao(f3);
		cb.registraBonificacao(f4);
		
		Funcionario[] folha = cb.getFolha();
		for (int indx = 0; indx < folha.length; indx++) {
			if (folha[indx] != null) {
				System.out.println("      \nNome: " + folha[indx].getNome());
				System.out.println("        CPF: " + folha[indx].getCpf());
				System.out.println("    Salario: " + folha[indx].getSalario());
				System.out.println("Bonificacao: " + folha[indx].getBonificacao());
			}
		}
		
		System.out.println("   \nTotal de Salarios: " + cb.getTotalSalarios());
		System.out.println("Total de Bonificacoes: " + cb.getTotalBonificacoes());
		System.out.println("   Diferenca (bonificacoes - salarios): " + cb.getDiferenca());
	}
}
