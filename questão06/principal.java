package quest�o06;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
	
		System.out.println("Vamos descobrir se um n�mero � primo:");
		Scanner n1 = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		int num1 = n1.nextInt(); 
		
		if ((num1 / num1 == 1) && (num1 / 1 == num1)) {
		System.out.println("O n�mero " + num1 + " � primo!");
			}
		else { 
		System.out.println("O n�mero " + num1 + " n�o � primo!");
		}
		n1.close();	

	}

}
