package EstruturasDeControles;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o numero da tabuada a ser calculada: ");
			int numero = teclado.nextInt();
		System.out.print("Digite a expressão: ");
			String ope = teclado.next();
		
		if(ope.equals("+")) {
			for(int c = 0; c<=10; c++) {
				int res = c + numero;
				System.out.printf("%d + %d = %d\n", numero, c, res);
			}
		}else if(ope.equals("-")) {
			for(int c = 0; c<=10; c++) {
				int res = c - numero;
				System.out.printf("%d - %d = %d\n", numero, c, res);
			}
		}else if(ope.equals("*")) {
			for(int c = 0; c<=10; c++) {
				int res = c * numero;
				System.out.printf("%d * %d = %d\n", numero, c, res);
			}
		}else if(ope.equals("/")) {
			for(int c = 0; c<=10; c++) {
				int res = c / numero;
				System.out.printf("%d / %d = %d\n", numero, c, res);
			}
		}
	}
}
