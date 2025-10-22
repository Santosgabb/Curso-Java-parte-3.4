package atividademap;

import java.util.HashMap;
import java.util.Map;

public class AtividadeMap {

	public static void main(String[] args) {
		//Utilização do Map
		Map<String, Integer> produtos = new HashMap<>();
		
		//add 
		produtos.put("Arroz ",10 );
		produtos.put("Feijão",8 );
		produtos.put("Mandioca ",4);
		produtos.put("Ovo",5);	
		
		//verificando um produto especifico
		System.out.println("Quantos 'Feijão' tem : " + produtos.get("Feijão"));
		
		System.out.println("Estoque:");
		System.out.println(produtos);
		
		//atualizando a qtd 
		produtos.put("Feijão",1 );
		produtos.put("Arroz ",2 );
		
		System.out.println("Estoque Atualizado:");
		System.out.println(produtos);
	}

}
