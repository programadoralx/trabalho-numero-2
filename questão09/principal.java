package quest�o09;
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

	        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos n�meros desejar, para finalizar digite 30000!"));
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

	        JOptionPane.showMessageDialog(null, "A soma dos n�meros digitados �: " + somaNumeros + "\nA quantidade de n�meros digitados foi: " + quantidade + "\nA m�dia dos n�meros digitados �: " + media + "\nO maior n�mero digitado foi: " + maior + "\nO menor n�mero digitado foi: " + menor + "\nA m�dia dos n�meros pares �: " + mediaPar + "\nA m�dia dos n�meros �mpares �:" + mediaimpar + "\nA porcentagem de n�meros �mpares �:" + perc + "%");
	        System.out.println("A soma dos n�meros digitaddos �:" + somaNumeros);
	        System.out.println("A quantidade de n�meros digitados �:" + quantidade);
	        System.out.println("A m�dia dos n�meros digitados �: " + media);
	        System.out.println("O maior n�mero digitado foi :" + maior);
	        System.out.println("O menor n�mero digitado foi:" + menor);
	   	 	System.out.println("A m�dia dos n�meros pares �:" + mediaPar);
	   	 	System.out.println("A m�dia dos n�meros �mpares �:" + mediaimpar);
	   	 	System.out.println("A porcentagem de n�meros �mpares �:" + perc);
	    
	}

}
