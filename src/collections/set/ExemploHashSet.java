package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		Set<Double> notasAlunos = new HashSet<>();
		
		notasAlunos.add(5.8);
		notasAlunos.add(9.0);
		notasAlunos.add(9.8);
		notasAlunos.add(8.5);
		notasAlunos.add(9.9);
		notasAlunos.add(6.2);
		notasAlunos.add(10.0);
		notasAlunos.add(7.9);
		
		System.out.println(notasAlunos);
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		System.out.println(" ");
		System.out.println(numeros);
		Iterator<Integer> iterator = numeros.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		numeros.add(23);
		System.out.println("Tamanho "+ numeros.size());
		System.out.println(numeros.isEmpty());
		System.out.println(numeros);
		
		HashSet<Integer> numeross = new HashSet<Integer>();
		numeross.add(4);
		numeross.add(2);
		numeross.add(23);
		numeross.add(14);
		numeross.add(55);
		numeross.add(44);
		System.out.println(numeross	);
	}

}
