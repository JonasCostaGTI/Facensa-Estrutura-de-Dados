/**
 * 
 */
package EXG101;

/**
 * @author jonascosta
 * 
 * numeros multiplos de 3 e 5 dos numeros ate 1000
 *
 */
public class Multiplos {

	public static void main(String[] args) {

		int conta = 0;
		for (int i = 0; i <= 1000; i++) {
			
			if ((i % 3 == 0) || (i % 5 == 0) ) {
				conta += i;
			}
		}
		
		System.out.println("A soma dos numeros multiplos de 3 ou 5 ate 1000 é de: " + conta);
	}

}
