package EstruturasDeControles;

import java.util.Scanner;

public class WhileDesafio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite alguma coisa: ");
		String algo = teclado.next();
		
		//while indeterminado
		while(!algo.equalsIgnoreCase("sair")) {
			System.out.print("Digite alguma coisa: ");
			String algo1 = teclado.next();
			algo = algo1;
		}
		
		System.out.println("Saiu!");
	}
}
