package exercicio2;

import java.util.Scanner;

public class exer8 {

	public static void main(String[] args) {
		
		
		float custocon,custofa,dist,impos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual o custo de fábrica? ");
		custofa = leia.nextFloat();
		impos = (custofa * 45) / 100;
		dist =(custofa * 28) / 100;
		custocon = impos + dist+ custofa;
		
		System.out.printf("\nO custo ao consumidor de um carro novo é: %.2f ",custocon);

	}

}
