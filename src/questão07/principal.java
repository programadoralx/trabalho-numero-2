package questão07;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
  double num=0, soma=0, medNumpar=0, numDig=0, maiorNum=0, menorNum=0, quant=0, numImp=0, numPar=0;
	int i =0;	
   do {
  System.out.println("Informe um número ou digite 30.000 para finalizar a entrada:");
	   num = sc.nextDouble();
	   numDig = i;
	   soma = soma + num;
	   medNumpar += num/2;
	   i++;  
	} while (num != 30.000);
   if (quant == 0); {
	   maiorNum = num;
	   System.out.println("O maior número digitado é:" + maiorNum);}
	   if (num < maiorNum); { 
		menorNum= num;
		System.out.println(" O numero menor digitado é:"+ menorNum);}
	   if (num % 2 == 0)
	   numPar += 1;
	   else
		   numImp += 1;
	   System.out.println("A soma dos números digitados é:" + soma);
	   System.out.println("A quantidade de números digitados é:" + numDig);
	   System.out.println("A média dos números digitados é:" + medNumpar);
	   System.out.println("A porcentagem dos números impares é:" + numImp +"%");   
	   
   }

	
	
}

  
  
  