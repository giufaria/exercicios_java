package for_while_dowhile;

import java.util.Scanner;

public class while_3 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
int num, somaIdadeMenor = 0, somaIdadeMaior = 0;

System.out.println("Digite aqui a idade: ");
num = leia.nextInt();
while (num >= 0) {
  if (num < 21) {
      somaIdadeMenor++;
  }
  if (num > 50) {
      somaIdadeMaior++;
  }
  System.out.println("Digite aqui o valor de idade: ");
  num = leia.nextInt();

}
System.out.println("Total de pessoas menores de 21 anos: " + somaIdadeMenor);
System.out.println("Total de pessoas maiores de 50 anos: " + somaIdadeMaior);
	}

}
