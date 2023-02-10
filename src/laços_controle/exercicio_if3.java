package laços_controle;

import java.util.Scanner;

public class exercicio_if3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean res; 
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade  do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? ");
		res = leia.nextBoolean();
		
		if (idade>=18 && idade<60) {
			System.out.println("\n"+nome+" Está apto para doar sangue! ");
			
		}
		else if (idade>=60 && idade<=69 ){
			if (res==false) {
				System.out.println("Está apto para doar sangue!");
				
			}
			else {
				System.out.println("Não está apto para doar sangue!");
				
			}
			
			
			
		}
		else   {
			System.out.println("\n"+nome+" Não está apto para doar sangue! ");
		}
		
		
		

	}

}
