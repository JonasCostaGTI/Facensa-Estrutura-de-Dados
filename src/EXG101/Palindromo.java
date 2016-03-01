/**
 * 
 */
package EXG101;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 * Verifica se uma palavra ou numero é palindromo
 *
 */
public class Palindromo {

	public static void main(String[] args) {

		String palavra = JOptionPane.showInputDialog("digite uma palavra para saber se é ou nao palindromo: ");

		ArrayList<Character> lista1 = pegaLista1(palavra);
		System.out.println(lista1);

		ArrayList<Character> lista2 = pegaLista2(lista1);
		System.out.println(lista2);

		if (ListasIguais(lista1, lista2)) {
			System.out.println("A palavra: " + palavra + " é palindromo");
		} else {
			System.out.println("A palavra: " + palavra + " nao é palindromo");
		}

	}

	public static ArrayList<Character> pegaLista1(String palavra) {
		ArrayList<Character> lista1 = new ArrayList<Character>();

		for (int i = 0; i < palavra.length(); i++) {
			lista1.add(palavra.charAt(i));
		}
		return lista1;
	}

	public static ArrayList<Character> pegaLista2(ArrayList<Character> lista1) {
		ArrayList<Character> lista2 = new ArrayList<Character>();
		for (int i = lista1.size() - 1; i >= 0; i--) {
			lista2.add(lista1.get(i));
		}
		return lista2;
	}

	public static boolean ListasIguais(ArrayList<Character> lista1, ArrayList<Character> lista2) {

		if ((lista1.equals(lista2)) && (lista1.size() == lista2.size())) {
			return true;
		}
		return false;

	}

}
