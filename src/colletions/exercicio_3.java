package colletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> meuSet = new HashSet();
		
			for(int x=0;x<10;x++) {
				System.out.println("Digite um número:");
				int n= leia.nextInt();
				meuSet.add(n);
			}
			
			Iterator<Integer> imeuSet = meuSet.iterator();
			
			while (imeuSet.hasNext()) {
				System.out.println(imeuSet.next());
			}
	}

}
