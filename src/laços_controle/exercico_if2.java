package laços_controle;

import java.util.Scanner;

public class exercico_if2 {

	public static void main(String[] args) {
		
		int numero;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero%2==0 && numero>0) {
			System.out.println("O número "+numero+" é Par e positivo");
		}
		else if(numero%2>0 && numero<0) {
			System.out.println("O número "+numero+" é Ímpar e negativo");
			
		}
		else if(numero%2==0 && numero<0) {
			System.out.println("O número "+numero+" é Par e negativo");
		}
		else if(numero%2>0 && numero>0) {
			System.out.println("O número "+numero+" é Ímpar e positivo");
		}
	

	}

}