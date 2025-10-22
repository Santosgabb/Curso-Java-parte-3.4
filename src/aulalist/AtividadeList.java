package aulalist;

import java.util.ArrayList;
import java.util.List;

public class AtividadeList {

	public static void main(String[] args) {
		//List
		List<String> listaDeFilmes = new ArrayList<>();
		
		//add 
		listaDeFilmes.add("Velozes-Furiosos 5");
		listaDeFilmes.add("Carros 3");
		listaDeFilmes.add("One piece");
		
		//exibindo com um for
		System.out.println("Lista de filmes: ");
		//utilizando o for-each para por os filmes disponiveis
		for (String dispo: listaDeFilmes) {
			System.out.println(dispo);
		}
		System.out.println();
		//verificando se tem o filme especifico
		String filmeProcurado = "Carros 3" ; 
		if(listaDeFilmes.contains(filmeProcurado)) {
			System.out.println("O filme está na lista : "+ filmeProcurado);
		}else {
			System.out.println("O filme não está na lista"+ filmeProcurado);
		}
		
		

	}

}
