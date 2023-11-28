package main;

import java.util.Scanner;

import entities.FilaPedidos;
import entities.Pedido;
import entities.Produto;

public class FilaPedidosTeste {
	public static void main(String[] args) {
		FilaPedidos fila = new FilaPedidos();
		int resp = 0;
		do {
			resp = mostrarMenu();
			escolha(resp, fila);
		} while (resp != 0);

	}

	public static int mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"\nDigite o que você quer fazer: \n1)Adicionar Pedido \n2) Fazer a retirada de algum pedido \n3) Mostrar fila\n0) Sair ");
		return scanner.nextInt();
	}

	public static void escolha(int escolha, FilaPedidos fila) {

		switch (escolha) {
		case 0: 
			break;
		case 1:
			addPedido(fila);
			break;
		case 2:
			System.out.println(fila.saiPedido());
			break;
		case 3:
			fila.mostraPedidos();
			break;
		default:
			System.out.println("Opção Inválida!");
		}
	}
	
	public static void addPedido(FilaPedidos fila) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite quantos produtos teu pedido irá ter:");
		Pedido ped = new Pedido();
		int qtdProd = scanner.nextInt();
		for (int p = 0; p< qtdProd; p++) {
			System.out.println("Nome do Produto:");
			scanner.nextLine();
			String nomeProd = scanner.nextLine();
			System.out.println("Preço do Produto: ");
			float precoProd = scanner.nextFloat();
			Produto prod = new Produto(nomeProd,precoProd);
			ped.addProduto(prod);
		}
		fila.addPedido(ped);
	}

}
