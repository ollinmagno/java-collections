package digitalinnovation.queue;

import java.util.Queue;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ExercicioLinkedList {

	public static void main(String[] args) {
		
		Queue<String> listaNomes = new LinkedList<>();
		listaNomes.add("Juliana");
		listaNomes.add("Pedro");
		listaNomes.add("Carlos");
		listaNomes.add("Larissa");
		listaNomes.add("João");
		for(String list : listaNomes) {
			System.out.println(list);
		}
		
		System.out.println(" ");
		
		String primeiroNomeDaLista = listaNomes.peek();
		System.out.println("Primeiro nome da lista: " + primeiroNomeDaLista);
		
		System.out.println(" ");
		
		String removePrimeiroNome = listaNomes.poll();
		System.out.println(removePrimeiroNome);
		System.out.println(listaNomes);
		listaNomes.add("Daniel");
		
		System.out.println("Tamanho da lista: " + listaNomes.size());
		System.out.println(listaNomes.isEmpty());
		System.out.println(listaNomes.contains("Carlos"));
		listaNomes.clear();
		
		
	}

}
