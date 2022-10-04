package questao05;
import java.util. Scanner;
public class questao5 {

	public questao5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	int n, num, i, j, fat;
  Scanner fatorial;
  
  fatorial = new Scanner(System.in); 
  System.out.print("Digite a quantidade de numeros que serao lidos:");
  
  n = fatorial.nextInt();
		 
  for( i=1; i<=n; i++) {
	  System.out.println("\n Digite o "+ i +"º número");
      num = fatorial.nextInt();
      fat = 1 ;
      
for( j=1; j<=num ; j ++){
    fat = fat * j;
   System.out.println("O Fatorial de "+ num +" = " + fat);  
}
  }
	}

}
