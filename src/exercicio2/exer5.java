package exercicio2;

import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		
		double n1,n2,n3,total;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira a nota 1:  ");
		n1 = leia.nextDouble();
		System.out.println("Insira a nota 2: ");
		n2 = leia.nextDouble();
		System.out.println("Insira a nota 3: ");
		n3 = leia.nextDouble();
		
		total = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5); 
		System.out.printf("\nSua média final é:  %.1f",total);

	}

}
