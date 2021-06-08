package fundamentos;

public class Temperatura {
	
	public static void fah(int v1) {
		int F = v1;
		float res = (F - 32) * 5/9;
		System.out.println(res + "ºF");
	}
	
	
	public static void cels(int v1) {
		int C = v1;
		float res = (C * 1.800f) + 32.00f;
		System.out.println(res + "ºC");
	}
	
	public static void main(String[] args) {
		fah(86);
		cels(22);
	}
}
