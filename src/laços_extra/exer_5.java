package laços_extra;

import java.util.Scanner;

public class exer_5 {

	public static void main(String[] args) {
		
		float num,cal= 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número: ");
			num = leia.nextFloat();
			cal = cal +num;
				
			
		}

		
		while (num!=0) ; 
			
		System.out.println("A soma dos números digitados é: "+cal);
	}

}
