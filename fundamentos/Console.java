package fundamentos;

import java.util.Scanner;


public class Console {

	public static void motorista(int idade, String nome) {
		if(idade >= 18 && idade <80) {
			System.out.printf("%s pode dirigir", nome);
		}else {
			System.out.printf("%s não pode ser motorista", nome);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//recebe uma palavra
		System.out.println("Escreva o seu nome");
		String nome = entrada.nextLine();

		//recebe um numero
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		motorista(idade, nome);
		entrada.close();
	}
}
