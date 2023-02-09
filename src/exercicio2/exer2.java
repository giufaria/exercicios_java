package exercicio2;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		
		int idade_dias,anos,dias_Ano,mes,diasM;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual a sua idade em dia? ");
		idade_dias = leia.nextInt();
		anos = idade_dias / 365;
		dias_Ano = idade_dias % 365;
		
		mes = dias_Ano / 30;
		diasM = dias_Ano % 30;
		
		System.out.println("Você tem "+anos+" anos "+mes+" meses e "+diasM+"Dias");

	}

}
