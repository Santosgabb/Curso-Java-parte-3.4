package cursocase;

public class MesVersaoAntiga {

	public static void main(String[] args) {
		int mes = 4;

		switch (mes) {// Versão antiga de se utilizar o Switch-case 
		case 1:
			System.out.println("Janeiro");
			break;// prestar atencao no break
		case 2:
			System.out.println("fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mês invalido");// boa pratica usar
			break; // se o default for no final tem vez que nao precisa utilizar o break
		}
	}

}