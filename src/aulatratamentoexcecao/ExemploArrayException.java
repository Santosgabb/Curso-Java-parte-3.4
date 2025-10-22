package aulatratamentoexcecao;

public class ExemploArrayException {

	public static void main(String[] args) {

//Acessando uma posição que nao existe
		try {
			int[] numeros = { 1, 2, 3 };
			System.out.println(numeros[5]);//erro pois o tamanhho dele vai de 0 a 2
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro " + e.getMessage());
		} finally {
			System.out.println("Sempre é executado");
		}

	}
}