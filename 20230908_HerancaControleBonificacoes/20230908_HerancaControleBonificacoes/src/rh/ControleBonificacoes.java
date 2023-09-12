package rh;

public class ControleBonificacoes {
	private static final int NUMERO_FUNCIONARIOS = 10;
	private Funcionario[] folha;
	private int numeroElementos;
	
	public ControleBonificacoes() {
		folha = new Funcionario[NUMERO_FUNCIONARIOS];
		numeroElementos = 0;
	}
	
	public void registraBonificacao(Funcionario funcionario) {
		folha[numeroElementos++] = funcionario;
	}
	
	public double getTotalBonificacoes() {
		double total = 0.0;
		for (int indx = 0; indx < folha.length; indx++) {
			Funcionario f = folha[indx];
			if (f != null)
				total += f.getBonificacao();
		}
		
		return total;
	}
	
	public Funcionario[] getFolha() {
		return folha;
	}
	
	public double getTotalSalarios() {
		double total = 0.0;
		for (int indx = 0; indx < folha.length; indx++) {
			Funcionario f = folha[indx];
			if (f != null)
				total += f.getSalario();
		}
		
		return total;
	}

	public double getDiferenca() {
		return getTotalBonificacoes() - getTotalSalarios();
	}
}
