package laços_controle;

import java.util.Scanner;

public class exercicio_if4 {

	public static void main(String[] args) {
		
		String caracter1,caracter2,caracter3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva a primeira característica: ");
		caracter1 = leia.nextLine();
		System.out.println("\nEscreva a segunda característica: ");
		caracter2 = leia.nextLine();
		System.out.println("\nEscreva a terceira característica: ");
		caracter3 = leia.nextLine();
		
		if (caracter1.equalsIgnoreCase("vertebrado")) {
			if(caracter2.equalsIgnoreCase("ave")) {
				if (caracter3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Àguia");
				}else {
					System.out.println("Pomba");
				}
			}else {
				if(caracter3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nHumano");
				}else {
					System.out.println("\nVaca");
				}
			}
		}else {
			if(caracter2.equalsIgnoreCase("inseto")) {
				if (caracter3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nPulga");
				}else {
					System.out.println("\nLargata");
				}
			}else {
				if(caracter3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nsanguessuga");
					
				}else {
					System.out.println("\nMinhoca");
				}
			}
		}
				

	}

}
