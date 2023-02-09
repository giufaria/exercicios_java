package exercicio2;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		
		
		double A,B,C,D,S,R;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva A: ");
		A = leia.nextDouble();
		System.out.println("Escreva B: ");
		B = leia.nextDouble();
		System.out.println("Escreva C:");
		C = leia.nextDouble();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R + S) / 2;

		System.out.println("O resultado é: "+D);
	}

}
