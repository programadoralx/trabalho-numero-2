package questão08;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
int opções, sal, imper, aum, nosal;
		
		System.out.println("MENU DE OPÇÕES");
		System.out.println("1- Impostos");
		System.out.println("2- Novo Salário");
		System.out.println("3- Classificação");
		System.out.println("4- Finalizar o Programa");
		System.out.println("Digite a Opção desejada");
		
		Scanner sc = new Scanner(System.in);
	    opções = sc.nextInt();
		
	    if (opções > 4 || opções < 1) {
	    	System.out.println("Opção Inválida!");
	    }
	    
	    if(opções == 1) {
	    	Scanner fc= new Scanner(System.in);
	    	System.out.println("Qual o seu salário?");
		    sal= fc.nextInt();
		    if(sal < 500) {
		    	System.out.println("O valor dos seus impostos é:");
		    	imper = sal * 5/100;
		    	System.out.println(imper);
		    }
		    if(sal >= 500 && sal <= 850){
		    	System.out.println("O valor dos seus impostos é:");
		    	imper = sal * 10/100;
		    	System.out.println(imper);
		    }
		    if(sal >850) {
		    	System.out.println("O valor dos seus impostos é:");
		    	imper = sal * 15/100;
		    	System.out.println(imper);
		    }
	    	
	    }
	    if(opções == 2) {
	    	Scanner fc= new Scanner(System.in);
	    	System.out.println("Qual o seu salário?");
		    sal= fc.nextInt(); 
		    
		    if(sal > 1500) {
		    	aum = 25;
		    	System.out.print("Seu novo Salário é: R$");
		    	nosal = sal + aum; 
		    	System.out.println(nosal);
		    }
		    if(sal >= 750 && sal <= 1500){
		    	aum = 50;
		    	System.out.print("Seu novo Salário é: R$");
		    	nosal = sal + aum; 
		    	System.out.println(nosal);
		    }
		    if(sal >= 450 && sal < 750) {
		    	aum = 75;
		    	System.out.print("Seu novo Salário é: R$");
		    	nosal = sal + aum; 
		    	System.out.println(nosal);
		    }
		    if(sal < 450) {
		    	aum = 100;
		    	System.out.print("Seu novo Salário é: R$");
		    	nosal = sal + aum; 
		    	System.out.println(nosal);

		    }
		   
		    
	    }
	    if(opções == 3) {
	    	Scanner fc= new Scanner(System.in);
	    	System.out.println("Qual o seu salário?");
		    sal= fc.nextInt(); 
		    
		    if(sal <= 700) {
		    	System.out.println("Mal Remunerado");
		    }else if(sal > 700) {
		    	System.out.println("Bem Remunerado");
		    }
	    }
	    if(opções == 4) {
	    	System.out.println("Até Breve!");
	    }

	}

}
