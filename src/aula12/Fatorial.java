package aula12;

public class Fatorial {

	public static void main(String[] args) {
		
		
		int n = fatorial(5);
		
		System.out.println(n);
		
	}

	private static int fatorial(int numero) {
		if (numero ==1) {
			return 1;
		} else {	
			return(numero * fatorial(numero -1));
		}
	}

}
