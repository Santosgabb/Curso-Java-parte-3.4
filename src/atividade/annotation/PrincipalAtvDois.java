package atividade.annotation;

public class PrincipalAtvDois {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		//Criação do obj 
		MinhaClasseAtvDois atv = new MinhaClasseAtvDois();
		
		//chamando os metodos
		int soma = atv.calcularProduto(5, 4);
		int produto = atv.calcularSoma(3, 30);
		
		System.out.println("Soma: " + soma);
		System.out.println("Produto: " + produto);
		
		//atv 3
		ExemploDepreciado ex = new ExemploDepreciado();
		ex.metodoObsoleto();
		
	
	}

}
