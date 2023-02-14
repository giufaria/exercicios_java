package laços_extra;

import java.util.Scanner;

public class exer_2 {

	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner(System.in);
		int num, cont, contP=0, contI=0;
		
		
		for (cont=0;cont<10;cont++){
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			if (num%2==0) {
				contP++;
			}
			
			else {
			contI++;
		}
	}
		System.out.println("\nA quantidade de números par é : "+contP);
		System.out.println("\nA quantidade de números impares é : "+contI);

	}

}
