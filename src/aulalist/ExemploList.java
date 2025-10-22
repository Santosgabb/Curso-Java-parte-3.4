package aulalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		//Utilizando o ArrayList
		List<String> lista = new ArrayList<>();
		
		//permite elementos duplicados		
		lista.add("Java");
		lista.add("Java");
		lista.add("C++");
		lista.add("Python");

		//verificando se a lista tem o elemento
		System.out.println("Contém 'java'? "+lista.contains("Java"));

		//Acessando elemento por posição
		System.out.println("Elemento de tal posição: " + lista.get(1));
		
		//add toddos os elementos de outra colrção
		List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
		//jogando o que ha em uma lista em outra
		lista.addAll(outraLista);
	
		
		//imprimindo todo o resulatado
		System.out.println("Lista Completa: " + lista);
		
		//removendo pelo nome 
		lista.remove("Python");
		
		//removendo pela posição
		lista.remove(2);
		System.out.println("Saida após remoção" + lista);
		
		//obtendo elemento pelo indice
		String elemento = lista.get(0);
		System.out.println("Elemento que procuramos pela posição: " + elemento);
		
		lista.clear();
		System.out.println("Lista Limpa: " + lista);
	
	
	}

}
