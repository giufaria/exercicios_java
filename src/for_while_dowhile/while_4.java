package for_while_dowhile;

import java.util.Scanner;

public class while_4 {

	public static void main(String[] args) {
		
				Scanner leia = new Scanner(System.in);

				
				int idade, sexo, categoria = 0, pessoas_back_end = 0, mulheres_front_end = 0, homens_mobile_quarenta = 0,
						mulheres_full_trinta = 0;
				String continua = "s";

				 
				while (!continua.equals("n")) {

					
					System.out.println("Digite a idade: ");
					idade = leia.nextInt();

					
					System.out.println("\nDigite o Sexo: ");
					System.out.println("1 - Masculino");
					System.out.println("2 - Feminino ");
					System.out.println("3 - Outros");
					sexo = leia.nextInt();

					
					System.out.println("\nDigite a Categoria: ");
					System.out.println("1 – Backend");
					System.out.println("2 – Frontend");
					System.out.println("3 – Mobile");
					System.out.println("4 - FullStack");
					categoria = leia.nextInt();

					
					System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
					System.out.println("\nDeseja continuar: ");
					System.out.println("\nSim (S) / Nâo(N)");
					continua = leia.next();
					System.out.println("++++++++++++++++++++++++++++++++++");

					
					if (categoria == 1) {
						pessoas_back_end++;
					} if (categoria == 2) {
						if (sexo == 2) {
							mulheres_front_end++;
						}
					} if (categoria == 3) {
						if (sexo == 1) {
							if (idade > 40) {
								homens_mobile_quarenta++;
							}
						}
					} if (categoria == 4) {
						if (sexo == 2) {
							if (idade < 30) {
								mulheres_full_trinta++;
							}
						}
					}

				}

				
				System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d", pessoas_back_end);
				System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: %d", mulheres_front_end);
				System.out.printf("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: %d", homens_mobile_quarenta);
				System.out.printf("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: %d", mulheres_full_trinta);

	}

}
