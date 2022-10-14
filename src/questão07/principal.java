package questão07;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Campeonato de Futebol");

		double altura = 0, peso = 0, mediaAltura = 0, mediaIdade = 0, quantPeso = 0, somaPeso = 0, quantAltura = 0, porc = 0, tot80 = 0;
		int times = 0, jogadores = 0, quantIdadeInferior = 0, quantIdade = 0, idade;
		
		
		System.out.println("Digite a quantidade de times: ");
		times = entrada.nextInt();		
		System.out.println("Digite a quantiddade de jogadores: ");
		jogadores = entrada.nextInt();
			
			for(int i=1; i<=times; i++){	
			for (int j = 1; j<=jogadores; j++){ 
				System.out.println("Digite a idade, o peso e a altura do jogador " + j + " do time " + i);
				idade = entrada.nextInt();
				peso = entrada.nextDouble();
				altura = entrada.nextDouble();
					
		if(idade <18 ){
			quantIdadeInferior++;
		}
		
		quantIdade = quantIdade + idade;
		mediaIdade = quantIdade/jogadores;
		
		quantAltura = quantAltura + altura;
		mediaAltura = quantAltura/jogadores;
		
		}
		
		if (peso>80) {
			tot80 = tot80 + 1;
			porc = tot80 * 100/jogadores;

		}
		
		}
			System.out.println("A quantidade de jogadores com idade inferior a 18 anos é: "+ quantIdadeInferior);
			System.out.println("A média de idades dos jogadores: "+ mediaIdade);
			System.out.println("A média de alturas dos jogadores: "+ mediaAltura);		
			System.out.println("Porcentagem de jogadores com peso acima de 80: "+ porc + "%");

	}

}
