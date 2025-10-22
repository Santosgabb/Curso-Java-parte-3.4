package aulatratamentoexcecao;

public class ExemploException {

	public static void main(String[] args) {
		int totalNotas = 100;
		int qtdAlunos = 10;

		// calculando a media
		try {
			int media = totalNotas / qtdAlunos; // divisao por 0
			System.out.println("Resultado:  " + media);

		} catch (ArithmeticException e) {
			System.out.println("Problema: Divisão por zero" + e);
		} finally {
			System.out.println("O Programa terminou.");
		}
		//A partir do Java 22 é possivel usar _ como variavel 
		/*catch(ArithmeticException _) {
		System.out.println("Problema: Divisão por zero" + a_);
	}*/
	}

}
