package quest�o07;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
  double num=0, soma=0, medNumpar=0, numDig=0, maiorNum=0, menorNum=0, quant=0, numImp=0, numPar=0;
	int i =0;	
   do {
  System.out.println("Informe um n�mero ou digite 30.000 para finalizar a entrada:");
	   num = sc.nextDouble();
	   numDig = i;
	   soma = soma + num;
	   medNumpar += num/2;
	   i++;  
	} while (num != 30.000);
   if (quant == 0); {
	   maiorNum = num;
	   System.out.println("O maior n�mero digitado �:" + maiorNum);}
	   if (num < maiorNum); { 
		menorNum= num;
		System.out.println(" O numero menor digitado �:"+ menorNum);}
	   if (num % 2 == 0)
	   numPar += 1;
	   else
		   numImp += 1;
	   System.out.println("A soma dos n�meros digitados �:" + soma);
	   System.out.println("A quantidade de n�meros digitados �:" + numDig);
	   System.out.println("A m�dia dos n�meros digitados �:" + medNumpar);
	   System.out.println("A porcentagem dos n�meros impares �:" + numImp +"%");   
	   
   }

	
	
}

  
  
  