package exercicio3;
import java.util.Scanner;

public class principal {

	public principal() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c, delta, d= -4, b2, v2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de 'a': ");
		a = entrada.nextInt();
		while(a == 0) {
			System.out.println("O valor de 'a' não pode ser igual '0' ");
		System.out.println("Digite novamente um valor para 'a': ");
		a = entrada.nextInt();
		}
		System.out.println("digite o valor de 'b': ");
		b = entrada.nextInt();

		System.out.println("digite o valor de 'c': ");
		c = entrada.nextInt();

		System.out.println("Resolvendo o valor de Delta");
		System.out.println("A formula de Delta é: b².4.a.c");
		System.out.println("Substituindo na formula, "
				+ "temos:" +b+"²" +d+"." +a+"."+c);
		b2 = b*b;
		v2 = ((d) *(a)* (c));
		delta = (b2)+(v2) ;
		System.out.println(" ");
		System.out.println(" O valor de Delta é: " +delta);
		double r1;
		double r2;
		if (delta < 0) {
			System.out.println("A equação não possui raizes reais");
			
		}else {
			r1 = (-b + Math.sqrt(delta))/(2*a);
			r2 = (-b - Math.sqrt(delta))/(2*a);

		System.out.println(" ");
		System.out.println("A raiz 1 de x' :" +r1);
		System.out.println("A raiz 1 de  x' :"+r2);

	}

	}
}
