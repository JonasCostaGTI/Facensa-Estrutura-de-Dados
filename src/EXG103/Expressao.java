package EXG103;

public class Expressao {
	private static int topo;
	private static final int TOPO = -1;
	static String expressao = "a[8]+{b*(c/(d+e))-13}";
	private static String[] pilhaDeDados = new String[expressao.length()];

	public static void main(String[] args) {

		
		topo = TOPO;
		String[] dados = pegaDado(expressao);
		
		fazPush(dados);
		
		
		boolean verificaParenteses = verificaParenteses(dados.length);
		
		boolean verificaColcetes = verificaColchetes(dados.length);
		
		boolean verificaChaves = verificaChaves(dados.length);
		
		
		if (veirficaEhRegular(verificaChaves,verificaColcetes,verificaParenteses)) {
			System.out.println("A expressao: " + expressao + " é regular");
		}else {
			System.out.println("A expressao: " + expressao + " nao é regular");
		}
		
		
		
		
		
//		pop();
//		peek();
	}

	private static boolean veirficaEhRegular(boolean verificaChaves, boolean verificaColcetes,
			boolean verificaParenteses) {
		if (verificaChaves && verificaColcetes && verificaParenteses == true) {
			return true;
		}else {
			return false;
		}
		
	}

	private static boolean verificaChaves(int length) {
		int aberto = 0;
		int fechado = 0;
		for (int i = 0; i < length; i++) {
			if (pilhaDeDados[i].equals("{")) {
				aberto++;
			}if (pilhaDeDados[i].equals("}")) {
				fechado++;
			}
		}
			if (aberto == fechado && aberto != 0 && fechado != 0) {
				return true;
			}else {
				return false;
			}
	}

	private static boolean verificaColchetes(int length) {
		int aberto = 0;
		int fechado = 0;
		for (int i = 0; i < length; i++) {
			if (pilhaDeDados[i].equals("[")) {
				aberto++;
			}if (pilhaDeDados[i].equals("]")) {
				fechado++;
			}
		}
			
			if (aberto == fechado && aberto != 0 && fechado != 0) {
				return true;
			}else {
				return false;
			}
	}

	private static boolean verificaParenteses(int length) {
		int aberto = 0;
		int fechado = 0;
		for (int i = 0; i < length; i++) {
			if (pilhaDeDados[i].equals("(")) {
				aberto++;
			}if (pilhaDeDados[i].equals(")")) {
				fechado++;
			}
		}
			
			if (aberto == fechado && aberto != 0 && fechado != 0) {
				return true;
			}else {
				return false;
			}
		
	}

	private static void mostraPilha(int length) {
		for (int i = 0; i < length; i++) {
			System.out.println(pilhaDeDados[i]);
		}
		
	}

	private static void fazPush(String[] dados) {
		for (int i = 0; i < dados.length; i++) {
			push(dados[i]);
		}
		
	}

	private static void push(String string) {
		pilhaDeDados[++topo] = string;
		
	}

	private static String[] pegaDado(String expressao2) {
		return expressao2.split("");
		
	}

	private static String peek() {
		return pilhaDeDados[topo];
		
	}

	private static String pop() {
		return pilhaDeDados[topo--];
		
	}

}
