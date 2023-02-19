package Estrutura_De_Dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia  = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		
		do {
			System.out.println("********************************");
			System.out.println("                                ");
			System.out.println("1 - Adicionar Clientes na Fila  ");
			System.out.println("2 - Listar todos os Clientes    ");
			System.out.println("3 - Retirar Cliente da Fila     ");
			System.out.println("0 - Sair                        ");
			System.out.println("                                ");
			System.out.println("********************************");
			System.out.println("                                ");
			System.out.println("Entre com a opção desejada:     ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome: ");
				String nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente adicionado!");
			break;
			
			case 2:
				leia.nextLine();
				System.out.println("Lista de Clientes na lista: ");
				for(Iterator<String> it = fila.iterator(); it.hasNext();) {
					System.out.println(it.next());
				}
			break;
			
			case 3:
				leia.nextLine();
				if(fila.isEmpty()==true) {
					System.out.println("A fila está vazia");
				}
				else {
					System.out.printf("O(A) cliente %s foi chamado(a)!\n",fila.poll());
					System.out.println("Fila: \n");
					for(Iterator<String> it = fila.iterator(); it.hasNext();) {
						System.out.println(it.next());						
					}
					System.out.println();
				}
			break;
			
			case 0:
				leia.nextLine();
				System.out.println("Programa Finalizado!");
			break;
				
				default:
					System.out.println("Opção inválida!");
			}
			
		}while(opcao!=0);
	}

}
