package tratamento.excecao.atv;

public class ArrayExercicio {
	// criaçãodo metodo para acessar o elemento de um array

	public static int acessarElementos(int[] array, int indice) {
		try {
			return array[indice];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Índice fora dos limites do array.");
			return -1; // Valor padrão para indicar erro
		}
	}

	public static void main(String[] args) {
		int[] meuArray = { 10, 20, 30, 40, 50 };
		// Teste com índices válidos
		System.out.println("Elemento no índice 2: " + acessarElementos(meuArray, 2));

		// Teste com índice inválido
		System.out.println("Elemento no índice 10: " + acessarElementos(meuArray, 10));

	}

}
