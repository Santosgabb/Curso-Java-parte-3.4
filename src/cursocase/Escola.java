package cursocase;

public class Escola {

	public static void main(String[] args) {
		// C ponto flutuante || Atribuindo valor
		double nota1 = 5.0, nota2 =6.0;
		double result = (nota1 + nota2) /2.0 ;
		
		if (result >= 6.0) {
			System.out.println("Aprovado com MEDIA DE: " + result);
		}else {
			System.out.println("Reprovado com MEDIA DE: "+ result);
		}
	}

}
