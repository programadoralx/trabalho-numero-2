package Principal; // Quest�o 02 T2

import java.util.Scanner; // Quest�o 02

public class Principal {

	public static void main(String[] args) {
		int num1, num2, soma, op��o;
		float  raiz; 
		
		System.out.println("MENU");
		System.out.println("1 - Somar dois n�meros");
		System.out.println("2 - Raiz quadrada de um n�mero"); 
		System.out.println("                              ");
		System.out.println("Digite sua op��o: ");
		Scanner op = new Scanner (System.in);
		op��o = op.nextInt();
		
		if(op��o == 1) {
			System.out.println("Digite um valor para o primeiro n�mero: ");
			Scanner nu = new Scanner (System.in);
			num1 = nu.nextInt();
			
			System.out.println("Digite um valor para o segundo n�mero: ");
			Scanner mer = new Scanner (System.in);
			num2 = mer.nextInt();
			soma = num1 + num2;
			System.out.println("A soma de " + num1 + " + " + num2 + " �: " + soma);
			
		}
		else if (op��o == 2){
			System.out.println("Digite um valor: ");
			Scanner nu = new Scanner (System.in);
			num1 = nu.nextInt();
			raiz = (float)Math.sqrt(num1);
			System.out.println("A raiz quadrada de " + num1 + " �: " + raiz);
		}
		else if ((op��o != 1) && (op��o != 2)) {
			System.out.println("Op��o Inv�lida!");
		}
		
	}

}
