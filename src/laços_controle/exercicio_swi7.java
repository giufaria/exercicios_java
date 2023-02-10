package laços_controle;

import java.util.Scanner;

public class exercicio_swi7 {

	public static void main(String[] args) {
		
		float num1,num2,cal;
		int cod;
		Scanner leia = new Scanner(System.in);
		
		 
		System.out.println("\nCódigo: ");
		System.out.println("\nCódigo 1 - Soma");
		System.out.println("\nCódigo 2 - Subtração");
		System.out.println("\nCódigo 3 - Multiplicação");
		System.out.println("\nCódigo 4 - Divisão");
		System.out.println("\nDigite o 1 número: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o 2 número: ");
		num2 = leia.nextFloat();
		System.out.println("Digite o código: ");
		cod = leia.nextInt();
		

		switch(cod) {
		case 1:
			cal = num1 + num2;
			System.out.printf("%.1f + %.1f = %.1f ",num1,num2,cal);
		break;
		case 2:
			cal = num1 - num2;
			System.out.printf("%.1f - %.1f = %.1f ",num1,num2,cal);
		break;
		case 3:
			cal = num1 * num2;
			System.out.printf("%.1f x %.1f = %.1f ",num1,num2,cal);
		break;
		case 4:
			cal = num1 / num2;
			System.out.printf("%.1f / %.1f = %.1f ",num1,num2,cal);
		break;
		default:
			System.out.println("\nOpção Inválida");
	}

}
	}

