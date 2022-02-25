package application;

import java.util.Scanner;

import entitites.Operacoes;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		char sinal = sc.next().charAt(0);
		int num2= sc.nextInt();
		
		Operacoes ope = new Operacoes();
		
		switch(sinal) {
		case '+':
			System.out.println(ope.soma(num1, num2));
			break;
		case '-':
			System.out.println(ope.subtracao(num1, num2));
			break;
		case 'x':
			System.out.println(ope.multiplicacao(num1, num2));
			break;
		case '/':
			System.out.println(ope.divisao(num1, num2));
			break;
		case '%':
			System.out.println(ope.resto(num1, num2));
			break;
		case 'e':
			System.out.println(ope.expoente(num1, num2));
			break;
		case 'r':
			System.out.println(ope.raiz(num1));
			break;

		default:
			System.out.println("Digite uma operação valida");
			break;
		
		}
		sc.close();
	}

}
