package fundamentos;

public class PrimeiroPrograma {
	
	public static void Teste() {
		System.out.println("O metodo Teste diz Olá CAVALO");
	}
	
	public static void Somar(int a, int b) {
		int res = a + b;
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		System.out.println("Ola Mundo");
		Teste();
		Somar(2, 2);
	}
}
