package matrizes_vetores;

import java.util.Scanner;

public class exer_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x,valor;
		int[] dados = new int [10]; 
		
		for (x=0;x<10;x++) {
			System.out.println("\nDigite um número: ");
			dados[x]=leia.nextInt();
		}
		
		System.out.println("\nDigite o valor que deseja vizualizar a posição: ");
		valor =leia.nextInt();
		
		for (x=0;x<10;x++) {
			if(valor==dados[x]) {
				System.out.println("O número "+valor+" está na posição "+x);
			}
		}
	}

}
	


