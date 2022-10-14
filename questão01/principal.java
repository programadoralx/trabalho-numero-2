package questão01;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num, poi;
		   Scanner in = new Scanner (System.in);
		   System.out.print("digite um numero");
		    num = in.nextInt();
		    poi = (num%2);
		     if (poi==0) {
		     System.out.println ("O número "+num+" é par");
		      } else {
		    	 System.out.println ("O número "+num+" é impar");
		    	 
		      }   
	}

}
