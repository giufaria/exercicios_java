package Estrutura_De_Dados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao;
		do {
			System.out.println("*****************************");
			System.out.println("                             ");
			System.out.println("1 - Adicionar livros na Pilha");
			System.out.println("2 - Listar todos os Livros   ");
			System.out.println("3 - Retirar Livro da Pilha   ");
			System.out.println("0 - Sair                     ");
			System.out.println("                             ");
			System.out.println("*****************************");
			System.out.println("Entre com a opção desejada:  ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome: ");
				String nomeLivro = leia.nextLine();
				livros.push(nomeLivro);
				System.out.println("Livro adicionado!");
			break;
			
			case 2:
				System.out.println("Lista de Livros na pilha:\n");
				for(Iterator<String> it = livros.iterator(); it.hasNext();) {
					System.out.println(it.next());
				}
			break;
			
			case 3:
				if(livros.isEmpty()== true) {
					System.out.println("A pilha está vazia!");
				}
				else {
					System.out.printf("O livro %s foi retirado da pilha\n",livros.peek());
					livros.pop();
					System.out.println("Pilha:");
					for(Iterator<String> it = livros.iterator(); it.hasNext();) {
						System.out.println(it.next());
					}
				System.out.println();
				}
			break;
			
			case 0:
				System.out.println("Programa Finalizado!");
			break;
			
			default:
				System.out.println("Opção inválida!!");
			}
			
		}while(opcao !=0);

	}

}
