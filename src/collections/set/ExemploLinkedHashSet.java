package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();
		
		sequenciaNumerica.add(6);
		sequenciaNumerica.add(10);
		sequenciaNumerica.add(12);
		sequenciaNumerica.add(20);
		sequenciaNumerica.add(50);
		sequenciaNumerica.add(100);
		
		System.out.println(sequenciaNumerica);
		sequenciaNumerica.remove(10);
		System.out.println(sequenciaNumerica);
		
		System.out.println(sequenciaNumerica.size());
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("");
		for(Integer numero : sequenciaNumerica) {
			System.out.println(numero);
		}
		//sequenciaNumerica.clear();
		System.out.println(sequenciaNumerica.isEmpty());
		System.out.println(" ");
		
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		System.out.println(numeros);
		
		Iterator<Integer> iteratorNumeros = numeros.iterator();
		while(iteratorNumeros.hasNext()) {
			System.out.println(iteratorNumeros.next());
		}
		
		numeros.add(23);
		System.out.println("Tamanho: "+ numeros.size());
		System.out.println(numeros.isEmpty());
		System.out.println(numeros);
		
	}

}
