package laços_extra;

import java.util.Scanner;

public class exer_3 {

	public static void main(String[] args) {
		int idade= 0,cont= 0,c= 0;
		
		Scanner leia = new Scanner(System.in);
		
	
	
	    while (idade!=-99 ) {
	    System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		if (idade<21) {
			cont ++;
			
		}else if (idade>50) {
			c ++;
			
		}
		
		
		
		
	    }
	
	    System.out.println("Total de pessoas com a idade maior de 50 anos: "+c);
	    System.out.println("Total de pessoas com a idade de menor de 21 anos: "+cont);
	}

	}


