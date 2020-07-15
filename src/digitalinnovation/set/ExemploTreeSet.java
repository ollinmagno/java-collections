package digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeCapitais = new TreeSet<String>();
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Curitiba");
		treeCapitais.add("Maceió");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		System.out.println(treeCapitais.first());
		System.out.println(treeCapitais.pollLast());
		System.out.println(treeCapitais);
		
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		System.out.println(numeros);
		System.out.println(" ");
		
		Iterator<Integer> iterator = numeros.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(numeros);
		System.out.println("Tamanho: "+ numeros.size());
		System.out.println(numeros.isEmpty());
		
	}

}
