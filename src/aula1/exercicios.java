package aula1;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
	
		//exercício 1
		
		float salario,abono,novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOlá, qual é o seu Salário atual? ");
		salario = leia.nextFloat();
		System.out.println("\nQual o valor do Abono? ");
		abono = leia.nextFloat();
		novosalario = salario + abono ;
		System.out.printf("\nSeu novo Salário é: %.2f",novosalario);
		
		//exercício 2 
		
		
		float nota1,nota2,nota3,nota4,media;
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nNota 1");
		nota1 = input.nextFloat();
		System.out.println("\nNota 2 ");
		nota2 = input.nextFloat();
		System.out.println("\nNota 3  ");
		nota3 = input.nextFloat();
		System.out.println("\nNota 4 ");
		nota4 = input.nextFloat();
		
		media = (nota1+nota2+nota3+nota4) / 4;
		System.out.printf("Média final: %.1f",media);
		
		
		//exercício 3
		
		float salarioBruto,adicionalNoturno,horaExtra,desconto,salarioliquido;
		
		Scanner veja = new Scanner(System.in);
		System.out.println("\nSalário Bruto: ");
		salarioBruto = veja.nextFloat();
		System.out.println("\nAdicional Noturno: ");
		adicionalNoturno = veja.nextFloat();
		System.out.println("\nHora Extra: ");
		horaExtra = veja.nextFloat();
		System.out.println("\nDesconto: ");
		desconto = veja.nextFloat();
		salarioliquido = salarioBruto+adicionalNoturno+(horaExtra*5)-desconto;
		System.out.printf("\nSalário Líquido: %.2f",salarioliquido);
	
		
		
		//exercício 4
		
		int n1,n2,n3,n4,calculo;
		Scanner olhe = new Scanner(System.in);
		System.out.println("\nnúmero1 ");
		n1 = olhe.nextInt();
		System.out.println("\nnúmero2 ");
		n2 = olhe.nextInt();
		System.out.println("\nnúmero3 ");
		n3 = olhe.nextInt();
		System.out.println("\nnúmero4 ");
		n4 = olhe.nextInt();
		calculo= (n1*n2)-(n3*n4);
		System.out.println("Diferença: "+calculo);
		
		
		
		
		
	}

}
