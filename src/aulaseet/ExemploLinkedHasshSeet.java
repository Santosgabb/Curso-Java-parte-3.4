package aulaseet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHasshSeet {

	public static void main(String[] args) {
		//Utilizando outro tipo LinkedHasSet
		Set<String> nomes = new LinkedHashSet<>();
		
		//Possui ordem de Inserção
		nomes.add("Gabriel White");
		nomes.add("Maria blue");
		nomes.add("Carlos Brown");
		//saida 
		System.out.println("Nomes :" + nomes);
		
		//removendo 
		nomes.remove("Maria blue");
		System.out.println("Atualização de Nomes :" + nomes);
		
		//tanto Hash quanto o Link nao permite que vc add um elemnto que ja foi add
		nomes.clear();
		System.out.println("Atualização: "+ nomes);
	}

}
