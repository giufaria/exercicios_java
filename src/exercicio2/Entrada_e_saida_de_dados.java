package exercicio2;

import java.util.Scanner;

public class Entrada_e_saida_de_dados {

	public static void main(String[] args) {
		
	int anos,meses,dias,total;
	
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nAnos: ");
	anos = leia.nextInt();
	System.out.println("\nMeses: ");
	meses = leia.nextInt();
	System.out.println("\nDias: ");
	dias = leia.nextInt();
	
	total = dias + (anos * 365) + (meses * 30);
	
	System.out.println("\nSua idade em dias é: "+total);
		
	

	}

}
