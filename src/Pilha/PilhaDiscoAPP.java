package Pilha;

import EXG104.Discografia;

public class PilhaDiscoAPP {

	public static void main(String[] args) {
		PilhaDisco discos = new PilhaDisco();
		
		discos.push(new Discografia(1, "Nirvana", "Never Mind"));
		discos.push(new Discografia(2, "Kalipso", "Joelma 1"));
		discos.push(new Discografia(3, "Pink Floyd", "1"));
		discos.push(new Discografia(4, "Imagine Dragons", "smoke mirror"));
		discos.push(new Discografia(5, "Beatles", "yellow submarine"));
		
		
		System.out.println("Peek: " +discos.peek());
		
		discos.listar();
		
		System.out.println("Pop: " +discos.pop());
		
		while (! discos.estaVazio()) {
			System.out.println("Pop do while: " +discos.pop());	
		}
		

	}

}
