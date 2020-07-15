package digitalinnovation.map;

import java.util.Hashtable;

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
	}

}
