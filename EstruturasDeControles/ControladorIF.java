package EstruturasDeControles;

import java.util.Scanner;

public class ControladorIF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia");
		double media = entrada.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("REPROVADO!");
		}
		
		entrada.close();
	}
}
