package questão06;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vamos descobrir se um número é primo:");
		Scanner n1 = new Scanner(System.in);
		System.out.print("Digite um número:");
		int num1 = n1.nextInt(); 
		
		if ((num1 / num1 == 1) && (num1 / 1 == num1)) {
		System.out.println("O número " + num1 + " é primo!");
			}
		else { 
		System.out.println("O número " + num1 + " não é primo!");
		}
		n1.close();
	}

}
