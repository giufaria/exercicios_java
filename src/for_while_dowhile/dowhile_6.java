package for_while_dowhile;

import java.util.Scanner;

public class dowhile_6 {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
	        
	        int n;
	        int qtd=0; 
	        int media=0; 
	        int p1=0; 
	        
	        do {
	            System.out.println("Digite um número:");
	            n = s.nextInt();
	            
	            if(n%3==0 && n!=0) {
	                p1+=n;
	                qtd++;
	            }
	            
	        }while(n!=0);
	        media = p1/qtd;
	        
	        System.out.println("A média de todos os números múltiplos de 3 é: "+media);


	}

}
