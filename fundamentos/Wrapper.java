package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000"); //int
		Long l = 100000L;
		
		String nome = "100";
		
		System.out.println(b.byteValue() );
		System.out.println(Integer.parseInt(nome)); 
	}
}
