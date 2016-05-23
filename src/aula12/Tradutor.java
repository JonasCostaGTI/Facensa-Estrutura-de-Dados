package aula12;

public class Tradutor {

	public static void main(String[] args) {
		System.out.println(Tradutor.msgShirink("AAABBBCCD"));

	}

	private static String msgShirink(String msg) {
		
		return msgShirinkReal(msg,"", 0);
	}

	private static String msgShirinkReal(String msg, String lastMsg, int cont) {
		if (msg.isEmpty()) {
			return "";
		}else if (msg.substring(0,1).equals(lastMsg)) {
			return msgShirinkReal(msg.substring(1), lastMsg, cont + 1);
		}else {
			return lastMsg + (cont == 0? "":cont+1) + msgShirinkReal(msg.substring(1), msg.substring(0,1), 0) ;
		}
		
		
	}

}
