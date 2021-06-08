package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double n1 = teclado.nextDouble();
		System.out.print("Digite o seguinte numero: ");
		double n2 = teclado.nextDouble();
		System.out.print("Digite a operação: ");
		
		String ope = teclado.next();
		
		System.out.println(ope.equals("+") ? n1 + n2 : "");
		System.out.println(ope.equals("-") ? n1 - n2 : "");
		System.out.println(ope.equals("*") ? n1 * n2 : "");
		System.out.println(ope.equals("/") ? n1 % n2 : "");
		
		
		
	}
}
