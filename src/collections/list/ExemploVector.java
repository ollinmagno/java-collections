package collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ExemploVector {
	public static void main(String[] args) {
		List<String> esportes = new Vector<>();
		esportes.add("Futebol");
		esportes.add("Basquete");
		esportes.add("Tênis de mesa");
		esportes.add("Handebol");
		
		esportes.remove(1);
		boolean temHandebol = esportes.contains("Handebol");
		System.out.println(temHandebol);
		System.out.println("get 1: " + esportes.get(1));
		System.out.println(esportes);
		System.out.println(" ");
		Iterator<String> iterator = esportes.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------");
		for(String esporte : esportes) {
			System.out.println(esporte);
		}
	}
}
