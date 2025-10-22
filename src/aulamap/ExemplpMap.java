package aulamap;

import java.util.HashMap;
import java.util.Map;

public class ExemplpMap {

	public static void main(String[] args) {
		//
		Map<String,Integer> mapa = new HashMap<>();
		
		//add elementos
		mapa.put("Java", 23);
		mapa.put("Python", 10);
		mapa.put("C++", 15);
		
		//verificanco se contem a chave
		System.out.println("Contem 'Java': "+ mapa.containsKey("Java"));//true
		
		//obtendo o valor associado a uma chave 
		System.out.println("Valor associado a Java: " + mapa.get("Java"));//vai ser 20 pois está procurando java
		
		//add mais elementos
		mapa.put("JavaScript", 28);
		mapa.put("Ruby", 28);
		
		//exibe sem ordem 
		System.out.println("Mapa sem ordem:  "+mapa);
		
		//removendo elemento
		mapa.remove("Python");
		
		//exibindo o novo resultado 
		System.out.println("Mapa apos remoção: " + mapa);
		
		//atualizando o valor a uma chave
		mapa.put("Java", 30);
		System.out.println("Atualizou o valor de Java" + mapa);
		
		//limpando mapa 
		mapa.clear();
		System.out.println("Mapa Limpo " + mapa);
	}

}
