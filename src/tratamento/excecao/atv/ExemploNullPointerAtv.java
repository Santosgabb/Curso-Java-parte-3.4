package tratamento.excecao.atv;

public class ExemploNullPointerAtv {

	public static void main(String[] args) {
		Integer num = null;
		Integer num2 = 1346;
		//testando com as duas variavel
		try {
			//convertendo para string
			System.out.println(num.toString());
			//System.out.println(num2.toString());
			// num.toString();
		} catch (NullPointerException npe) {
			System.out.println("Erro: Preencha a variavel,pois está null " + npe);
		}finally {
			System.out.println("Esse bloco é executado");
		}
	}

}
