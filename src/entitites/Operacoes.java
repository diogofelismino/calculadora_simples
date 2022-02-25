package entitites;

public class Operacoes {
	
	public Operacoes() {}
	
	
	public double soma(int num1, int num2) {
		return num1 + num2;
	}
	public double subtracao(int num1, int num2) {
		return num1 - num2;
	}
	public double multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	public double divisao(int num1, int num2) {
		return num1 / num2;
	}
	public double resto(int num1, int num2) {
		return num1 % num2;
	}
	public double expoente(int num1, int num2) {
		return Math.pow(num1, num2);
	}
	public double raiz(int num1) {
		return Math.sqrt(num1);
	}
	

	

}
