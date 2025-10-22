package aulaseet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreSet {

	public static void main(String[] args) {
		// TreeSet
		Set<String> nomes = new TreeSet<>();
		// Possui ordem Alfabetica ou numerica
		nomes.add("Zizu White");
		nomes.add("Gabriel White");
		nomes.add("Maria blue");
		nomes.add("Carlos Brown");
		nomes.add("Aurerio Brown");
		// saida
		System.out.println("Nomes :" + nomes);

		// removendo
		nomes.remove("Maria blue");
		System.out.println("Atualização de Nomes :" + nomes);

		// tanto Hash quanto o Link nao permite que vc add um elemnto que ja foi add
		nomes.clear();
		System.out.println("Atualização: " + nomes);

	}

}
