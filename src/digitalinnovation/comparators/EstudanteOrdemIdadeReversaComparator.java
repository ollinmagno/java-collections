package digitalinnovation.comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {
	
	@Override
	public int compare(Estudante primeiroEstudante, Estudante segundoEstudante) {
		return primeiroEstudante.getIdade() - segundoEstudante.getIdade();
	}
}
