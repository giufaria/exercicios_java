package laços_controle;

import java.util.Scanner;

public class exercicio_if1 {

	public static void main(String[] args) {
		
		
		int A,B,C;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		A = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		B = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		C = leia.nextInt();
		
		
		if (A+B>C) {
			System.out.println("\n"+A+" + "+B+" > "+C);
			System.out.println("\nA soma de A + B é maior do que C!! ");
		}
		else if (A+B<C) {
			System.out.println("\n"+A+" + "+B+" < "+C);
			System.out.println("\naA soma de A + B é menor do que C!! ");
		}
		else if (A+B==C) {
			System.out.println("\n"+A+" + "+B+" = "+C);
			System.out.println("A soma de A + B é igual a C!! ");
			
		}
		
		
		
		
	}
	

}
