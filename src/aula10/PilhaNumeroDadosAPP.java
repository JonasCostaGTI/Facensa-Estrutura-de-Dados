package aula10;

import java.util.ArrayList;
import java.util.Random;

public class PilhaNumeroDadosAPP {

	private static final int TAMANHO = 10;

	public static void main(String[] args) {
		ArrayList<Integer> dados = new ArrayList<Integer>();
		
		Random random = new Random();
		Integer numeroRandom;
		
		for (int i = 0; i < TAMANHO; i++) {
			numeroRandom = random.nextInt();
			dados.add(numeroRandom);
		}
		
		Pilha pilhaDados = new Pilha(dados.size());
		
		for (Integer numeroDoDado : dados) {
			pilhaDados.push(numeroDoDado);
			
		}
		
		
		System.out.println("");
		
		pilhaDados.pop();
		
		System.out.println("");
		
		pilhaDados.peek();
		
		
		
		
		
		pilhaDados.ordenar(pilhaDados);
		
		

	}

}
