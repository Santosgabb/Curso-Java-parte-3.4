package cursocase;

public class EscolaoNotaFrequencia {

	public static void main(String[] args) {
		int nota1 = 6, nota2= 6, frequencia = 70, media;
		media = (nota1 + nota2)/2;
		
		if (media >= 7 && frequencia >=75) {
			System.out.println("Aluno aprovado com media de :"+ media);
			System.out.println("frequencia de: "+ frequencia +"%");
		}else {
			System.out.println("Aluno Reprovado com media de :"+ media);
			System.out.println("frequencia de: "+ frequencia +"%");

		}
		
	}

}
