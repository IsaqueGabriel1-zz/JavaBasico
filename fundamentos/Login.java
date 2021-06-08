package fundamentos;

import java.util.Scanner;


public class Login {
	
	public static void Logar(String n, int s) {
		String nome = "Isaque";
		int senha = 1234;
		
		if((n.equals(nome)) && (s == senha)) {
			System.out.println("Usuario logado com sucesso!");
		}else {
			System.out.println("Usuario não cadastrado!");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("---------lOGIN---------");
		
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Senha: ");
		int senha = teclado.nextInt();
		
		Logar(nome, senha);
		teclado.close();  
	}
}


