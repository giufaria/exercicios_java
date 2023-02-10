package laços_controle;

import java.util.Scanner;

public class exercicio_swi6 {

	public static void main(String[] args) {
		
		String nome;
		int cod;
		float salario,calculo;
		
		Scanner leia = new Scanner(System.in);
		 
		System.out.println("\nCódigo do cargo: ");
		System.out.println("\nCódigo 1 - Gerente - 10 %");
		System.out.println("\nCódigo 2 - Vendedor - 7 %");
		System.out.println("\nCódigo 3 - Supervisor - 9 %");
		System.out.println("\nCódigo 4 - Motorista - 6 %");
		System.out.println("\nCódigo 5 - Estoquista - 5 %");
		System.out.println("\nCódigo 6 - Técnico de TI - 8 %");
		System.out.println("\nOlá, qual é o seu nome? ");
		nome = leia.nextLine();
		System.out.println("Digite o código do cargo: ");
		cod = leia.nextInt();
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		switch(cod) {
		case 1:
			calculo = (salario * 10)/ 100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+calculo));
		break;
		case 2:
			calculo = (salario * 7) / 100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+calculo));
		case 3:
			calculo = (salario * 9) / 100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+calculo));
			break;
		case 4:
			calculo = (salario * 6) / 100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+calculo));
			break;
		case 5:
			calculo = (salario * 5) / 100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+calculo));
			break;
		case 6:
			calculo = (salario * 8) / 100;
			System.out.printf("\nSeu novo salário é: ",(salario+calculo));
			break;
			default:
				System.out.println("\nOpção Inválida");
		}
		
	

	}

}
