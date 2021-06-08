package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		double numA = 6 * (3+2);
		double numB = Math.pow(numA, 2) / 6;
		
		double numC = (1 - 5) * (2 - 7) / 2;
		double numD = Math.pow(numC, 2);
		
		double numG = numB - numD;
		double numH = Math.pow(numG, 3);
		
		double numK = Math.pow(10, 3);
		double resF = numH/numK;
		
		System.out.println(numB);
		System.out.println(numD);
		System.out.println(numG);
		System.out.println(numK);
		System.out.printf("Resposta final %s", resF);
	}
}
