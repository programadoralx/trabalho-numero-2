package Principal; // Questão 02 T2

import java.util.Scanner; // Questão 02

public class Principal {

	public static void main(String[] args) {
		int num1, num2, soma, opção;
		float  raiz; 
		
		System.out.println("MENU");
		System.out.println("1 - Somar dois números");
		System.out.println("2 - Raiz quadrada de um número"); 
		System.out.println("                              ");
		System.out.println("Digite sua opção: ");
		Scanner op = new Scanner (System.in);
		opção = op.nextInt();
		
		if(opção == 1) {
			System.out.println("Digite um valor para o primeiro número: ");
			Scanner nu = new Scanner (System.in);
			num1 = nu.nextInt();
			
			System.out.println("Digite um valor para o segundo número: ");
			Scanner mer = new Scanner (System.in);
			num2 = mer.nextInt();
			soma = num1 + num2;
			System.out.println("A soma de " + num1 + " + " + num2 + " é: " + soma);
			
		}
		else if (opção == 2){
			System.out.println("Digite um valor: ");
			Scanner nu = new Scanner (System.in);
			num1 = nu.nextInt();
			raiz = (float)Math.sqrt(num1);
			System.out.println("A raiz quadrada de " + num1 + " é: " + raiz);
		}
		else if ((opção != 1) && (opção != 2)) {
			System.out.println("Opção Inválida!");
		}
		
	}

}
