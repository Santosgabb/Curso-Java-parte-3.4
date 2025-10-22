package aulaannotation;
public class Cachorro extends Animal {
	
	// Sobrescrita de metodo
	public void latir() {
		System.out.println("O cachorro está latindo: au au au au");
	}
	
	
	@Override//Se nao utilizar essa annonations é criado 2 metodos
	public void fazerSom() {
		System.out.println("O cachorro faz som");
	}
	
}