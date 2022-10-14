package questão09;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		 
		double numero; double somaNumeros =0;
		double quantidade = 0;
	    double media = 0; double maior = 0;
	    double menor = 30000;
	    double qtdePar = 0; double mediaPar = 0;
	    double numeroPar = 0;    double numParTotal = 0;
	    double qtdeimpar = 0;  double mediaimpar = 0;
	    double numeroimpar = 0; double numimparTotal = 0;
	    double perc;
	    do {

	        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos números desejar, para finalizar digite 30000!"));
	        System.out.println("O valor digitado foi: " + numero);
	   	 	
	        somaNumeros += numero;
	        quantidade++;
	        media = somaNumeros / (quantidade);

	        if (maior < numero) {
	        	maior = numero;

	        }

	        if (menor > numero) {
	            menor = numero;

	        }

	      
	        
	        if (numero % 2 == 0) {
	            numeroPar = numero;
	            numParTotal += numeroPar;
	            mediaPar = numParTotal / (qtdePar);
	            qtdePar++;

	        }
	        
	        if (numero % 2 != 0) {
	            numeroimpar= numero;
	            numimparTotal += numeroimpar;
	            mediaimpar = numimparTotal / (qtdeimpar);
	            qtdeimpar++;
	        }
            perc = qtdeimpar * 100/quantidade;

	    }while (numero <30000);

	        JOptionPane.showMessageDialog(null, "A soma dos números digitados é: " + somaNumeros + "\nA quantidade de números digitados foi: " + quantidade + "\nA média dos números digitados é: " + media + "\nO maior número digitado foi: " + maior + "\nO menor número digitado foi: " + menor + "\nA média dos números pares é: " + mediaPar + "\nA média dos números ímpares é:" + mediaimpar + "\nA porcentagem de números ímpares é:" + perc + "%");
	        System.out.println("A soma dos números digitaddos é:" + somaNumeros);
	        System.out.println("A quantidade de números digitados é:" + quantidade);
	        System.out.println("A média dos números digitados é: " + media);
	        System.out.println("O maior número digitado foi :" + maior);
	        System.out.println("O menor número digitado foi:" + menor);
	   	 	System.out.println("A média dos números pares é:" + mediaPar);
	   	 	System.out.println("A média dos números ímpares é:" + mediaimpar);
	   	 	System.out.println("A porcentagem de números ímpares é:" + perc);
	    
	}

}
