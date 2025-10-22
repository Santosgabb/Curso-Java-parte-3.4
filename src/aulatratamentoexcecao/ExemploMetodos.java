package aulatratamentoexcecao;

public class ExemploMetodos {
	public static int calcularMedia(int notaTotal, int alunos)throws ArithmeticException {
		return notaTotal / alunos ;
	}

	public static void main(String[] args) {
		// 
		int totalNotas = 10 ; 
		int alunos = 10 ;
		try {
			int media = calcularMedia(totalNotas, alunos);
			System.out.println("Media das Notas: " + media);
		}catch(ArithmeticException ae) {
			System.out.println("Erro: Divisão por zero - " + ae.getMessage());//.getMessage() Localiza o problema
		}finally {
			System.out.println("Programa executado");
		}
		
		System.out.println("o programa seque normalmente com o bloco try-catch e o finally...");

	}

}
