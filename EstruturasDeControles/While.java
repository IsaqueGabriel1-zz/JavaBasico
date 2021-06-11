package EstruturasDeControles;

public class While {
	public static void main(String[] args) {
		int cont = 1;
		
		while(cont<=10) {
			cont++;
			int num = 2;
			int res = num + cont;
			System.out.printf("%d + %d = %d\n", cont, num, res);
		}
	}
}
