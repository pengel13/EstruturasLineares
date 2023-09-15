package salarios;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario f1 = new FuncionarioHorista("Pedro Engel", "05426366039", 50.0, 45.0);
		System.out.println(f1.getRendimentos());

	}

}
