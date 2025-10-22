package atividade.annotation;

public class PrincipalSuperClasseeMinhaClasse {
	public static void main(String []args) {
		//criação de obj
		MinhaClasse mc = new MinhaClasse();
		SuperClasse sc = new SuperClasse();
		
		mc.imprimir(); // saida de resultado da classe filha
		sc.imprimir();// saida da classe pai 
		
	}
}
