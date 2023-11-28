package entities;
import java.util.*;

public class FilaPedidos {
	Queue<Pedido> queue = new LinkedList<>();
	public FilaPedidos() {}
	public String saiPedido(){
		Pedido pedidoQueSaiu = queue.poll();
		if (pedidoQueSaiu == null) {
			return "Não há produtos na fila ainda!";
		}
		return pedidoQueSaiu.toString() + " saiu!";
	}
	
	public String addPedido(Pedido pedido) {
		boolean confirmacaoPedido = queue.offer(pedido);
		if (confirmacaoPedido) {
			return pedido.toString() + " entrou na fila!";
		}
		return pedido.toString() + " não entrou na fila!";
	}
	public void mostraPedidos() {
		for (Pedido p : this.queue) {
			System.out.print(p.toString()+ "\n");
		}
	}
}
