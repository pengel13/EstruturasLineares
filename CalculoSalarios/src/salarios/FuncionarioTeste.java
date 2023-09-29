package salarios;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcHorista = new FuncionarioHorista("Pedro Engel", "05426366090", 'M', 50.0, 45.0);
		Funcionario funcComissionado = new FuncionarioComissionado("Arthur Keka", "89085297800", 'G', 0.50, 2500);
		Funcionario funcComissionadoSalario = new FuncionarioComissionadoBaseSalario("Lorenzo KS", "15091903000", 'M',
				0.15, 5000, 1200);
		Funcionario funcAssalariado = new FuncionarioAssalariado("Guilherme Lacerda", "00000000000", 'M', 3100);
		Funcionario[] funcionarios = { funcHorista, funcComissionado, funcComissionadoSalario, funcAssalariado };

		mostrarRendimentos(funcionarios);

	}

	public static void mostrarRendimentos(Funcionario[] funcionarios) {
		for (int index = 0; index < funcionarios.length; index++) {
			mostrarRendimentos(funcionarios[index]);
		}
	}

	public static void mostrarRendimentos(Funcionario funcionario) {
		if (funcionario.getGenero() == 'M') {
			System.out.println("O Funcionário " + funcionario.getNome() + " recebe R$" + funcionario.getRendimentos());
		} else {
			System.out.println("A Funcionária " + funcionario.getNome() + " recebe R$" + funcionario.getRendimentos());
		}
	}
}
