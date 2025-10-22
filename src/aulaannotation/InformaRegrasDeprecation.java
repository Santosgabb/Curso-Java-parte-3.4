package aulaannotation;

public class InformaRegrasDeprecation {
	
	@Deprecated//esse metodo nao vai ser mais utilizado quando for utilizado na classe principal
	public void mostrarRegrasParaAposentadorias() {
		System.out.println("Regras para Aposentadoria");
	}
	public void mostrarNovasregrasParaAposentadoria() {
		System.out.println("NOVAS regras para a aposentadoria");
	}
	
	
	public void chamarMetodoObsoleto() {
		 mostrarRegrasParaAposentadorias();
	}
	
	
	public static void main (String[]args) {
	
		InformaRegrasDeprecation regras = new InformaRegrasDeprecation();
		
		/*(obsoleto)
		uso de um metodo, q ñ vai utilizar mais
		*/
		//regras.mostrarRegrasParaAposentadorias(); metodo obsoleto
		
		//uso do novo metodo
		regras.mostrarNovasregrasParaAposentadoria();
		
		
		//chamando um metodo obsoleto
		regras.chamarMetodoObsoleto();
	}
			

}
