package cursocase;

public class DiasNoMes {

	public static void main(String[] args) {
		
		String mes = "Abril";
		
		String tipoMes = switch(mes) {
		case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro" , "Dezembro" -> "o número de dias é 31";
		case "Abril", "Junho", "Setembro" , "Novembro" -> "o número de dias é 30";
		case "Fevereiro"  ->"o número de dias é 28 (considerando um ano não bissexto).";
		default -> "Mês desconhecido";
		};
		System.out.println(tipoMes);
	}

}
