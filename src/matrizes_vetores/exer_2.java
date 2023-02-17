package matrizes_vetores;

import java.util.Scanner;

public class exer_2 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
				
				String impares="",pares="";
				int x,valor,soma=0;
				int[] numeros = new int[10]; 
				
				for (x=0;x<10;x++) {
					System.out.println("Digite um número: ");
					numeros [x] = leia.nextInt();
					
					soma += numeros[x];
				}
				for(x=0;x<10;x++) {
					if (x%2!=0) {
						impares+=numeros[x]+" ";
					}
					if (numeros[x]%2==0) {
						pares+=numeros[x]+" ";
					}
				}
				System.out.println("Elementos nos índices ímpares "+impares);
				System.out.println("Elementos pares: "+pares);
				System.out.println("A soma dos elementos é: "+soma);
				System.out.println("A média dos elementos é: "+(soma/10));
			}


	}


