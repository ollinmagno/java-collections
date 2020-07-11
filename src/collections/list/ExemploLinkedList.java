package collections.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class ExemploLinkedList {

	public static void main(String[] args) {
		Queue<String> filaBanco = new LinkedList<>();
		List<Integer> fila = new LinkedList<>();

		System.out.println(fila);
		filaBanco.add("Pamela");
		filaBanco.add("Patrícia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		String clienteASerAtendido = filaBanco.poll();
		System.out.println("clienteASerAtendido " + clienteASerAtendido);
		System.out.println(filaBanco);
		
		System.out.println(" ");
		
		String primeiroCliente = filaBanco.peek();
		System.out.println("primeiroCliente " + primeiroCliente);
		System.out.println(filaBanco);
		
		System.out.println(" ");
		//filaBanco.clear();
		String primeiroClienteOuErro = filaBanco.element();
		System.out.println(primeiroClienteOuErro);
		System.out.println(filaBanco);
		System.out.println(" ");
		for(String client : filaBanco) {
			System.out.println(client);
		}
	}

}
