package colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio_1 {

	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> cor = new ArrayList();
			
			for(int x=0;x<5;x++) {
				System.out.println("\nDigite a cor: ");
				String cores=leia.next();
				cor.add(cores);
			}
			System.out.println("\nEm ordem de inserção: "+cor);
			Collections.sort(cor);
			System.out.println("\nEm ordem alfabética: "+cor);

	}

}
