package for_while_dowhile;

import java.util.Scanner;

public class for_1 {

	public static void main(String[] args) {
		
		int n1,n2,cont;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextInt();
		
		if (n1<n2) {
			for(cont=n1 ;cont<=n2;cont++) {
				if (cont%3==0 && cont%5==0) {
					System.out.println("\n"+cont+"é múltiplo de 3 e 5");
					
				}
			}
			
		}else {
			System.out.println("\nIntervalo inválido");
		}
				
		
			
		
			
		

	}

}
