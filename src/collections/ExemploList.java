package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
	
		List<String> nomes = new ArrayList<>();
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(5);
		numeros.add(2);
		numeros.add(50);
		numeros.add(15);
		numeros.add(30);
		
		Collections.sort(numeros);
		System.out.println(numeros);
		numeros.set(2, 1500);
		System.out.println(numeros);
		
		nomes.add("Magno");
		nomes.add("Juliana");
		nomes.add("Maria");
		nomes.add("Amanda");
		nomes.add("Anderson");
		nomes.add("Zelda");
		
		
		Collections.sort(nomes);
		System.out.println(nomes);
		nomes.set(2, "Overwrite");
		System.out.println(nomes);
		
		String nome = nomes.get(3);
		int tamanho = nomes.size();
		boolean temMaria = nomes.contains("Maria");
		
		System.out.println(nome +", "+ tamanho);
		System.out.println(temMaria);
		
	}

}
