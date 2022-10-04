package Principal;// Questão 04

import java.util.Calendar;
import java.util.Date;
public class Principal {

	public static void main(String[] args) {
	
	    Calendar cal = Calendar.getInstance();
		Date d = new Date();
		cal.setTime(d);
		
		
		System.out.println("Data e Hora Instantânea!");
		System.out.println(d + ".");
		
		System.out.println("                            ");
		System.out.println("Ano, Mês e Dia de Hoje:");
		
		int ano = cal.get(Calendar.YEAR);
		System.out.println("Ano: "+ ano + ",");
		int mes = cal.get(Calendar.MONTH)+ 1;
	    System.out.println("Mês: " + mes + ",");
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Dia do Mês: "+ dia + ".");  
		
		System.out.println("                            ");
		System.out.println("Data Atual:  ");
		System.out.println(dia + "/" + mes + "/" + ano + ".");

		System.out.println("                            ");
		System.out.println("Mês Atual por Extenso: ");
		
		if(+cal.get(Calendar.MONTH) == 0) {
			System.out.println("Janeiro.");
		}
		else if(+cal.get(Calendar.MONTH) == 1){
			System.out.println("Fevereiro.");
		}
		else if(+cal.get(Calendar.MONTH) == 2){
			System.out.println("Março.");
}
		else if(+cal.get(Calendar.MONTH) == 3){
			System.out.println("Abril.");
	}
		else if(+cal.get(Calendar.MONTH) == 4){
			System.out.println("Maio.");
}
		else if(+cal.get(Calendar.MONTH) == 5){
			System.out.println("Junho.");
}
		else if(+cal.get(Calendar.MONTH) == 6){
			System.out.println("Julho.");
		}
		else if(+cal.get(Calendar.MONTH) == 7){
			System.out.println("Agosto.");
	}
		else if(+cal.get(Calendar.MONTH) == 8){
			System.out.println("Setembro.");
}
		else if(+cal.get(Calendar.MONTH) == 9){
			System.out.println("Outubro.");
		}
		else if(+cal.get(Calendar.MONTH) == 10){
			System.out.println("Novembro.");
	}
		else if(+cal.get(Calendar.MONTH) == 11){
			System.out.println("Dezembro.");
	}
		System.out.println("                            ");
		int hora = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		System.out.println("Hora Atual: ");
		System.out.println(hora + ":" + min);
}
}