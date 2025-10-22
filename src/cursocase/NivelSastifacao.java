package cursocase;
import java.util.Scanner;

public class NivelSastifacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nivel ;	
		
		//up no codigo
		String feedback;
		
		System.out.println("Digite o nivel de satisfação de 1 a 5");
		nivel = sc.nextInt();
		
		switch (nivel) {
		 case 1 -> feedback = "Muito insatisfeito";
		 case 2 -> feedback = "Insatisfeito";
		 case 3 -> feedback = "Neutro";
		 case 4 -> feedback = "Satisfeito";
		 case 5 -> feedback = "Muito satisfeito";
		 default -> feedback = "Opção inválida (deve estar entre 1e 5)";
		}
		System.out.println("Nível de satisfação: " + feedback);
		
		/*Utilização do Swich com uma expressao 
		switch(nivel) {
		case 1 -> System.out.println("Muito insatisfeito");
		case 2 -> System.out.println(" Insatisfeito");
		case 3 -> System.out.println("Neutro");
		case 4 -> System.out.println("Satisfeito");
		case 5 -> System.out.println("Muito Satisfeito");
		default -> System.out.println("Opção invalida");
		}*/
		sc.close();
	}
}
