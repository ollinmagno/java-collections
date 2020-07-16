package digitalinnovation.map;

import java.util.Hashtable;
import java.util.Iterator;

public class ExemploHashTable {

	public static void main(String[] args) {
		Hashtable<String, Integer> estudantes = new Hashtable<>();
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Rafaela", 18);
		estudantes.put("Pedro", 44);
		
		System.out.println(estudantes);
		estudantes.put("Pedro", 55);
		System.out.println(estudantes);
		
		estudantes.remove("Carlos");
		System.out.println(estudantes);
		
		int idadeEstudante = estudantes.get("Mariana");
		System.out.println(idadeEstudante);
		
		for(String key : estudantes.keySet()) {
			System.out.println(key + " - " + estudantes.get(key));
		}
		Hashtable<String, String> estadosDoBrasil = new Hashtable<>();
		estadosDoBrasil.put("AL", "Alagoas");
		estadosDoBrasil.put("SP", "São Paulo");
		estadosDoBrasil.put("MG", "Minas Gerais");
		estadosDoBrasil.put("AC", "Acre");
		estadosDoBrasil.put("AP", "Amapá");
		estadosDoBrasil.put("AM", "Amazonas");
		estadosDoBrasil.put("PB", "Paraíba");
		estadosDoBrasil.put("MS", "Mato Grosso do Sul");
		
		System.out.println(estadosDoBrasil);
		estadosDoBrasil.remove("MG");
		
		estadosDoBrasil.put("DF", "Distrito Federal");
		System.out.println("Tamanho " + estadosDoBrasil.size());
		
		Iterator<String> iterator = estadosDoBrasil.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " : " + estadosDoBrasil.get(key));
		}
		System.out.println(estadosDoBrasil.containsKey("SC"));
		System.out.println(estadosDoBrasil.contains("Maranhão"));
	}

}
