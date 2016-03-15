/**
 * 
 */
package EXG103;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 *
 */
public class Palindromo {

	private static int topo;
	private static final int TOPO = -1;
	private static int tamanho = 10;
	private static String[] pilhaLetras = new String[tamanho];

	public static void main(String[] args) {

		topo = TOPO;
		String palavra = JOptionPane.showInputDialog("Digite a palavra de tamanho no maximo 10: ");

		String[] letras = pegaLetras(palavra);

		fazPush(letras);

		mostraLetrasDapalavra(letras.length);

		// String letraRetirada = pop();
		// String letraDoTopo = peek();

		String[] pilhaInvertida = invertePilha(pilhaLetras, letras.length);

		mostraPilhaInvertida(pilhaInvertida, letras.length);
		
		System.out.println(verificaPalindromo(pilhaInvertida, pilhaLetras));
		

	}

	private static boolean verificaPalindromo(String[] pilhaInvertida, String[] pilhaLetras2) {
		int conta = 0;
		for (int i = 0, j = 0; i < pilhaInvertida.length; i++, j++) {
			if (!pilhaInvertida[i].equals(pilhaLetras2[j])) {
				conta++;
			}
		}
		
		if (conta != 0) {
			return false;
		}else{
			return true;
		}
		
		
	}

	private static void mostraPilhaInvertida(String[] pilhaInvertida, int tamanhoLength) {
		for (int i = 0; i < tamanhoLength; i++) {
			System.out.println(pilhaInvertida[i]);
		}

	}

	private static void fazPush(String[] letras) {
		for (int i = 0; i < letras.length; i++) {
			push(letras[i]);
		}
	}

	private static void mostraLetrasDapalavra(int tamanhoPilha) {
		for (int i = 0; i < tamanhoPilha; i++) {
			System.out.println(pilhaLetras[i]);
		}
	}

	private static String[] invertePilha(String[] pilhaLetras2, int tamanhoL) {

		String[] pilhaInertida = new String[tamanhoL];

		for (int i = 0; i < tamanhoL; i++) {
			pilhaInertida[i] = pop();
		}
		return pilhaInertida;

	}

	private static String peek() {
		return pilhaLetras[topo];

	}

	private static String pop() {
		return pilhaLetras[topo--];

	}

	private static void push(String letra) {
		pilhaLetras[++topo] = letra;

	}

	private static String[] pegaLetras(String palavra) {
		return palavra.split("");
	}

}
