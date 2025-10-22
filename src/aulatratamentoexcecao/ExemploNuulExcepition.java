package aulatratamentoexcecao;

public class ExemploNuulExcepition {
// Atributos da classe possui valor padrão como null ou 0 depende do tipo
	public static void main(String[] args) {
		// Usando o NullpointException é tentar acessar algo null
		// variavel locais deve ser inicializada d
		String nome = "gabriel";// variavel local sendo inicializada
		
		try {
			int tamanhoNome = nome.length();
			System.out.println("Qtd de numeros no nome: " + nome.length());
		} catch (NullPointerException e) {
			System.out.println("Erro: A variavel 'nome' está nula!");
		} finally {
			System.out.println("Sempre executa o bloco finaly");
		}

	}

}
