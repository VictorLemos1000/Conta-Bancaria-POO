package bancario.projeto.model;

import java.util.Scanner;

import javax.swing.JOptionPane;

// Nesta classe ela é onde se inicializa o programa para realizar demais funções do sistema bancário;
public class Programa {

	// Método de visualização do programa em geral
	public static void main(String[] args) {
		Scanner source = new Scanner(System.in);
		
		System.out.println(" Escolha as seguintes opções a serem realizadas pela no plataforma de conta bancária: "
				+ "\n\n OPÇÃO 1 - Crie sua conta bancária: "		
				+ "\n OPÇÃO 2 - Remover uma determinada conta associada: "
				+ "\n OPÇÃO 3 - Lozalize sua conta bancária: "
				+ "\n OPÇÃO 4 - Sair do sistema: ");
		int opcao = source.nextInt();
		
		//while () {
			// Opções desejadas para determinadas selecionadas
			switch (opcao) {
			case 1: {
				System.out.printf(" Você escolheu opção %d, criar uma conta.", opcao);
				
				break;
			}
			
			case 2: {
				System.out.printf(" Você escolheu opção %d, remover determinada conta associada.", opcao);

				break;
			}
			
			case 3: {
				System.out.printf(" Você escolheu opção %d, localizar sua conta bancária.", opcao);

				break;
			}
			
			case 4: {
				System.out.println(" Você optou por sair do sistema bancário.");
				
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + );
			//}
		}
	}
}
