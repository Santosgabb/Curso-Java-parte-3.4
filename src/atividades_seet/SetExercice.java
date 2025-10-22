package atividades_seet;

import java.util.HashSet;
import java.util.Set;

public class SetExercice {

	public static void main(String[] args) {
		//utilizando o set
		Set <Integer> numeros = new HashSet<>();
		
		//add numeros
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(21);
		numeros.add(23);
		
		System.out.println("Numeros: " + numeros);
		
		//verificando se tem numero
		System.out.println("Contem '10': " + numeros.contains(10));
		System.out.println("Contem '22': " + numeros.contains(22));
		
		//removendo numeros
		numeros.remove(10);
		System.out.println("Atualização apos remoção: " + numeros);
	
	
	}

}
