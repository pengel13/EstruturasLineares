package conversaoObjetos;

import java.util.Scanner;

public class TesteErroLEtra {
	public static void main(String[] args) throws LetraErro {
		Scanner scanner = new Scanner(System.in);
		Letra l1 = new Letra();
		System.out.println("Digite um núemro: ");
	
		int x = scanner.nextInt();
		System.out.println(l1.getBar(x));
	}
}
