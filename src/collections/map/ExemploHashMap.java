package collections.map;

import java.util.HashMap;
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
		
		System.out.println(campeoesMundialFifa);

	}

}
