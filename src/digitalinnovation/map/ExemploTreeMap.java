package digitalinnovation.map;

import java.util.Hashtable;
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
		
		TreeMap<String, String> estadosDoBrasil = new TreeMap<>();
		estadosDoBrasil.put("AL", "Alagoas");
		estadosDoBrasil.put("SP", "São Paulo");
		estadosDoBrasil.put("MG", "Minas Gerais");
		estadosDoBrasil.put("AC", "Acre");
		estadosDoBrasil.put("AP", "Amapá");
		estadosDoBrasil.put("AM", "Amazonas");
		estadosDoBrasil.put("PB", "Paraíba");
		estadosDoBrasil.put("MS", "Mato Grosso do Sul");
		
		
	}

}
