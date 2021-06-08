package fundamentos;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		//compara se a variavel do tipo String s, é igual a "2";
		System.out.println("2" == s);
		
		System.out.println(s.equals("2"));
	}
}
