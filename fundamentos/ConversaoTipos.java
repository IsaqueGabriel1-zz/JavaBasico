package fundamentos;

public class ConversaoTipos {
	public static void main(String[] args) {
		
//		covertendo de forma implicita
		double  a =  1.04564544566; 
		System.out.println(a);
		
		//coversão explicita com possibilidade de perda de informação (CAST)
		float b = (float) 1.04564123132;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);
		
		//implicito
		int h = 12;
		long j = h;
		
		//explicito. (CAST) == (int)
		long k = 12;
		int l = (int) k;
		 
	}
}
