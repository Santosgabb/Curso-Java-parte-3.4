package aulaseet;
import java.util.HashSet;
import java.util.Set;

//import java.util.*;   //importa todas as classes do pacotw java.util

public class ExemploHaashSet {

	public static void main(String[] args) {
		// Declaração do Set usando collect
		Set<String> conj = new HashSet<>();//utilizando o primeiro tipo do HashSet
		Set<Double> num = new HashSet<>();//utilizando o primeiro tipo do HashSet

		//O HashSet é rapido add, remove e busca mas nao mantem ordem  
		
		// add elementos ao conj
		conj.add("Java");
		conj.add("Python");
		conj.add("C++");

		//buscando um elemento com esse comando  conj.contains("Java")
		// verifica se o conjunto contem o elemento
		System.out.println("Contem 'Java'? " + conj.contains("Java"));

		// add mais elementos
		conj.add("JavaScript");
		conj.add("Ruby");

		// Imprime --> o que foi add
		System.out.println("Conjunto Completo: " + conj);

		// removendo elemento
		conj.remove("Pyton");

		// Impressao do q a apos a remoção
		System.out.println("Conjunto após remoção" + conj);

		// tentando add um elemento duplicado
		boolean foiAdd = conj.add("Java");
		// saida false
		System.out.println("Ja foi adicionado novamente ? " + foiAdd);

		// Limpando a collection
		conj.clear();
		System.out.println("Conjunto vazio: " + conj);
	
		
		//Usando numeros reais
		num.add(1.11);
		num.add(1.22);
		num.add(1.33);
		num.add(1.43);
		
		//exibindo o q ha, mas nao vai esta na mesma ordem, pois tem suas caracteristica
		System.out.println("Informando o que na collection criada de Numeros: " + num);
		
		//verificando se ha o numero que estou procurando 
		System.out.println("Contem '1.43'? " + num.contains(1.43));
	
		//add mais elemento
		num.add(1.77);
		num.add(1.97);
		
		// removendo 3 elemento q tinha no inicio
		
		num.remove(1.11);
		num.remove(1.22);
		num.remove(1.33);
		
		//atualização do que foi add eremovido
		System.out.println("Atualização do que adic e removido: "+ num);
		
		//add elemento duplicado que ja esta add
		boolean newadd = num.add(1.97); // da falso pois ja foi add
		System.out.println("Ja foi add esse elemento: " + newadd);
		
		newadd = num.add(1.9);
		System.out.println("Ja foi add esse elemento: " + newadd);
		System.out.println("Atualização: " + num);

		//limpando o que dentro do elemento
		num.clear();
		
		System.out.println("Atualização, apos limpar tudo: " + num);
		
	}

}
