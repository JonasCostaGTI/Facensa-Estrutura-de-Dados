/**
 * 
 */
package EXG101;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author jonascosta
 *
 */
public class NumerosRepitidos {

	public static void main(String[] args) {

	int tamanho = Integer.parseInt(JOptionPane.showInputDialog("digite o tamanho do array de numero: "));

		ArrayList<Integer> numerosDigitados = pegaNumerosDigitados(tamanho);
		System.out.println("numeros digitados: " + numerosDigitados);

		ArrayList<Integer> listaDeNumerosRepitidos = PegaNumerosRepitidos(numerosDigitados);
		System.out.println("lista de numeros repitidos: " + listaDeNumerosRepitidos);
		
		conta(listaDeNumerosRepitidos, numerosDigitados);

	}

	private static ArrayList<Integer> conta(ArrayList<Integer> listaDeNumerosRepitidos, ArrayList<Integer> numerosDigitados) {
		for (Integer numero : listaDeNumerosRepitidos) {
			int conta = 0;
			for (Integer numeroRepetido: numerosDigitados) {
				if (numeroRepetido == numero)
					conta++;
			}
			System.out.printf("%d foi repetido %d vezes\n", numero, conta);
		}

		return null;
	}



	
	
	
	
	private static ArrayList<Integer> PegaNumerosRepitidos(ArrayList<Integer> numerosDigitados) {
		ArrayList<Integer> numerosRepitidos = new ArrayList<>();
		
		for (int i = 0; i < numerosDigitados.size(); i++) {
			int conta = 0;
			for (int j = 0; j < numerosDigitados.size(); j++) {
				if (numerosDigitados.get(i) == numerosDigitados.get(j) ) {
					conta++;
				}
			}
			
			Integer numero = numerosDigitados.get(i);
			
			if (conta > 1 && !numerosRepitidos.contains(numero)){
				numerosRepitidos.add(numero);
			}
		}

		return numerosRepitidos;
	}


	
	
	private static ArrayList<Integer> pegaNumerosDigitados(int tamanho) {
		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < tamanho; i++) {
			numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero na posicao " + (i + 1))));
		}
		return numeros;
	}

}
