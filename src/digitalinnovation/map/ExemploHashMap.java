package digitalinnovation.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {
		Map<String, Integer> campeoesMundialFifa = new HashMap<>();
		campeoesMundialFifa.put("Brasil", 5);
		campeoesMundialFifa.put("Alemanda", 4);
		campeoesMundialFifa.put("Itália", 4);
		campeoesMundialFifa.put("Uruguai", 2);
		campeoesMundialFifa.put("Argentina", 2);
		campeoesMundialFifa.put("França", 2);
		campeoesMundialFifa.put("Inglaterra", 1);
		campeoesMundialFifa.put("Espanha", 1);
		//
		System.out.println(campeoesMundialFifa.entrySet());
		
		for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
			//System.out.println(entry.getKey() + " - "+ entry.getValue());
		}
		
		System.out.println(" ");
		
		Map<String, String> estadosDoBrasil = new HashMap<>();
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
		
		System.out.println(estadosDoBrasil);
		
		estadosDoBrasil.put("DF", "Distrito Federal");
		
		System.out.println(estadosDoBrasil.size());
		
		//estadosDoBrasil.remove();
		
		System.out.println(estadosDoBrasil);
		
		Iterator<String> iterator = estadosDoBrasil.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(estadosDoBrasil.get(key) + " : " + key);
		}
		
		boolean temSC = estadosDoBrasil.containsKey("SC");
		System.out.println("Santa Caratina: " + temSC);
		
		boolean temMA = estadosDoBrasil.containsValue("Maranhão");
		System.out.println("Maranhão: "+ temMA);
	}

}
