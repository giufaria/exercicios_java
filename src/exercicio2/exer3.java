package exercicio2;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		

		int segundos,hora,horasseg,min,minseg;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira os segundos: ");
		segundos = leia.nextInt();
		
		hora = segundos / 3600;
		horasseg = segundos % 3600;
		
		min = horasseg / 60;
		minseg = horasseg % 60;
		
		System.out.println("O tempo total foi de: "+hora+" horas "+min+" minutos e  "+minseg+" segundos ");
	}

}
