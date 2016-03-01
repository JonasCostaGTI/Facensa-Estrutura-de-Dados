package aula02;

/*
 * Soma dos numeros pares entre 0 a 100
 * 
 */

public class ArrayMultidimensionais {
	public static void main(String... args) {
		
		int [] listaDePares = new int[5];
		int conta = 0;
		
		for (int i = 1; i <=100; i++) {
			if ((i % 2 == 0)) {
				conta ++;
				if (conta < 5) {
					listaDePares[conta] = i;
				}
			}
		}
		
		
		for (int i : listaDePares) {
			System.out.println(i);
		}
		
		int soma = 0;
		for (int i = 0; i < listaDePares.length; i++) {
			soma += listaDePares[i];
		}
		
		
		System.out.println("A soma dos valores pares é de: " + soma);
	}
	
	
	
	

}
