package fundamentos;



public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));
		
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		
		String nome = "Isaque";
		String sobre = "Gabriel";
		int idade = 19;
		float salario = 12334.34556f;
		
		System.out.printf("O senhor %s %s tem %d anos, e ganha R$ %.2f", 
				nome, sobre, idade, salario);
	} 
}
