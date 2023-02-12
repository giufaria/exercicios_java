package for_while_dowhile;

import java.util.Scanner;

public class dowhile_5 {

	public static void main(String[] args) {
		
		int num,x = 0,cal = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: "); 
			num = leia.nextInt();
			if (num>0) {
				cal +=num;
			}
		}
		while (num!=0);
			System.out.println("\nA soma dos núemros positivos é: "+cal);
		

	}

}
