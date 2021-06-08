package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terça (v ou f);
		//trabalho na quinta(v ou f);
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv20 = !comprouTv50 ;
		boolean tomarSorvete = comprouTv50;
		boolean maisSaldavel = !tomarSorvete;
		
		
		System.out.println("Comprou tv 50p? " + comprouTv50);
		System.out.println("Comprou tv de 20p? " + comprouTv20);
		System.out.println("Vamos tomar sorvete? " + tomarSorvete);
		System.out.println("Estaram mais saldavel? " + maisSaldavel);

		
	}
}
