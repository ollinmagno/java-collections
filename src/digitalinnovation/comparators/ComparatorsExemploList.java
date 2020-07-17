package digitalinnovation.comparators;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorsExemploList {

	public static void main(String[] args) {
		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Magno", 22));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("Larissa", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("Carlos", 17));
		
		System.out.println("Ordem de inserção");
		System.out.println(estudantes);
		
		estudantes.sort((primeiro, segundo) -> primeiro.getIdade() - segundo.getIdade());
		
		System.out.println("Ordem natural dos números - idade");
		System.out.println(estudantes);
		
		estudantes.sort((primeiro, segundo) -> segundo.getIdade() - primeiro.getIdade());
		System.out.println("Ordem reversa dos números - idade");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
		
		System.out.println("Ordem natural dos números - idade, (method reference)");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		System.out.println("Ordem reversa dos números - idade, (method reference)");
		System.out.println(estudantes);
		
		Collections.sort(estudantes);
		
		System.out.println("Ordem natural dos números - idade (interface Comparable)");
		System.out.println(estudantes);
		
		Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
		
		System.out.println("Ordem reversa dos números - idade (interface Comparator)");
		System.out.println(estudantes);
	}

}
