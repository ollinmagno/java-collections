package digitalinnovation.map;

import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> treeCapitais = new TreeMap<>();
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florianópolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("BH", "Belo Horizonte");
		
		System.out.println(treeCapitais);
		System.out.println(treeCapitais.firstKey());
		System.out.println(treeCapitais.lastKey());
		

	}

}
