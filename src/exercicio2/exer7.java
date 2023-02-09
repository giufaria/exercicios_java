package exercicio2;

import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o de A: ");
		a = leia.nextFloat();
		System.out.println("\nEntre com o de B: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com o de C: ");
		c = leia.nextFloat();
		System.out.println("\nEntre com o de D: ");
		d = leia.nextFloat();
		System.out.println("\nEntre com o de E: ");
		e = leia.nextFloat();
		System.out.println("\nEntre com o de F: ");
		f = leia.nextFloat();
		
		x =(c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("O valor de X é: "+x+" e o valor de Y é "+y);
		

	}

}
