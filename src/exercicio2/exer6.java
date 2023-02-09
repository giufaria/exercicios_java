package exercicio2;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		
		Double x1,y1,x2,y2,soma,Resultado;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva o ponto 1: ");
		x1 = leia.nextDouble();
		System.out.println("Escreva o ponto 2: ");
		y1 = leia.nextDouble();
		System.out.println("Escreva o ponto 3: ");
		x2 = leia.nextDouble();
		System.out.println("Escreva o ponto 4: ");
		y2 = leia.nextDouble();
		
		soma = Math.pow((x2-x1), 2) + Math.pow((y2-y1),2);
		Resultado = Math.sqrt(soma);
		
		System.out.printf("\nA distância entre eles é: %.2f",Resultado);
		
		
		
	}

}
