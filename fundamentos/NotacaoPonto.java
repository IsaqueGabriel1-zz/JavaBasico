package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia";
		s = s.replace("dia", "Cavalo");
		s = s.toUpperCase();
		s = s.concat("!!!!!");
		
		
		System.out.println(s);
	
		String f = "Cavalo";
		f = f.strip();
	}
}
